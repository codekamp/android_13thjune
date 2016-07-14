package in.codekamp.myapplication;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.provider.ContactsContract;
import android.support.v4.content.SharedPreferencesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        EventBus.getDefault().register(this);


    }

    protected void favoriteSong(View view) {
        EventBus.getDefault().post(new NewFavoriteSongEvent(99));

        IntentFilter filter = new IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED);
        BroadcastReceiver receiver = new WifiStatusReceiver();
        registerReceiver(receiver, filter);

        unregisterReceiver(receiver);

        Intent intent = new Intent(Intent.ACTION_AIRPLANE_MODE_CHANGED);
        sendBroadcast(intent);

//        ContentResolver resolver = getContentResolver();
//        resolver.query(ContactsContract.Contacts.CONTENT_URI,)




        SharedPreferences preferences = getSharedPreferences("in.codekamp.myapplication", Context.MODE_PRIVATE);


        boolean shouldShowDemo = preferences.getBoolean("show_demo", true);

        if (shouldShowDemo) {
            //show demo

            SharedPreferences.Editor editor = preferences.edit();
            editor.putBoolean("show_demo", false);
            editor.commit();
        }





    }

    @Subscribe
    public void myRandomFunction(NewFavoriteSongEvent event) {
        Log.d("CodeKamp", "Favorite song with Id " + event.songId + " event caught in SecondActivity");
    }
}
