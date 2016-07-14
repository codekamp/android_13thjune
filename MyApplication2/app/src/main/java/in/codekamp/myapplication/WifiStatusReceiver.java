package in.codekamp.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class WifiStatusReceiver extends BroadcastReceiver {
    public WifiStatusReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("CodeKamp", "Broadcast received by our app");
        Log.d("CodeKamp", "state " + intent.getBooleanExtra("state", false));
    }
}
