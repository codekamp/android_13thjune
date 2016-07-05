package in.codekamp.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements Callback<ListResponse> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://us11.api.mailchimp.com/2.0/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        MailchimpService mailchimpService = retrofit.create(MailchimpService.class);

        Call<ListResponse> call = mailchimpService.fetchLists("");
        call.enqueue(this);

        Call<ContactResponse> call1 = mailchimpService.fetchContacts("", "55ec6cd534");

        call1.enqueue(new Callback<ContactResponse>() {
            @Override
            public void onResponse(Call<ContactResponse> call, Response<ContactResponse> response) {
                for (int i = 0; i < response.body().getContacts().size(); i++) {
                    Log.d("CodeKamp", response.body().getContacts().get(i).getProfile().getFirstName());
                }
            }

            @Override
            public void onFailure(Call<ContactResponse> call, Throwable t) {
                Log.d("CodeKamp", t.getMessage());
                t.printStackTrace();
            }
        });
    }

    @Override
    public void onResponse(Call<ListResponse> call, Response<ListResponse> response) {
        for (int i = 0; i < response.body().getContactLists().size(); i++) {
            Log.d("CodeKamp", response.body().getContactLists().get(0).getId());
        }
    }

    @Override
    public void onFailure(Call<ListResponse> call, Throwable t) {

    }
}
