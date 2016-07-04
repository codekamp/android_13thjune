package in.codekamp.sharingsupporter;

import android.content.Intent;
import android.provider.AlarmClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // https://developer.android.com/guide/components/intents-common.html

    }

    public void setAlarm(View view) {

        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM);
//        intent.setType("*/*");
        intent.putExtra(Intent.EXTRA_TEXT, "My random message");


        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

//        Intent chooserIntent = Intent.createChooser(intent, "Choose an Alarm App");
//
//        startActivity(chooserIntent);




    }
}
