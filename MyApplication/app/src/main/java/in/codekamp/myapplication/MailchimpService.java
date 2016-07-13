package in.codekamp.myapplication;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by cerebro on 05/07/16.
 */

// read more about Retrofit at https://github.com/codepath/android_guides/wiki/Consuming-APIs-with-Retrofit
public interface MailchimpService {

    @GET("lists/list")
    Call<ListResponse> fetchLists(@Query("apikey") String apiKey);

    @GET("lists/members")
    Call<ContactResponse> fetchContacts(@Query("apikey") String apiKey, @Query("id") String listId);
}
