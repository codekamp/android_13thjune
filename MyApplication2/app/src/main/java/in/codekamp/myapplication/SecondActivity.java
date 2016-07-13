package in.codekamp.myapplication;

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
    }

    @Subscribe
    public void myRandomFunction(NewFavoriteSongEvent event) {
        Log.d("CodeKamp", "Favorite song with Id " + event.songId + " event caught in SecondActivity");
    }
}
