package in.codekamp.asynctaskdemo;

import android.app.IntentService;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by cerebro on 01/07/16.
 */
public class ImageDownloaderService extends IntentService {
    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     */
    public ImageDownloaderService() {
        super("downloader_thread");

        Log.d("CodeKamp", "Constructor of service called");
    }


    @Override
    public void onCreate() {
        super.onCreate();

        Log.d("CodeKamp", "OnCreate of service called");
    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);

        Log.d("CodeKamp", "OnStart of service called");
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        Log.d("CodeKamp", "onHandleIntent of service called");

        String urlString = intent.getStringExtra("image_url");

        Log.d("CodeKamp", "Starting download of " + urlString);

        try {
            URL url = new URL("https://us11.api.mailchimp.com/2.0/lists/list?apikey=d4c0308ce74b55d7f29f791d04d4ed4b-us11");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");



            InputStreamReader reader = new InputStreamReader(connection.getInputStream());

            BufferedReader reader1 = new BufferedReader(reader);

            String line = reader1.readLine();

            String totalResponse = "";

            while (line != null) {
                totalResponse += line;
                line = reader1.readLine();
            }

            JSONObject object = new JSONObject(totalResponse);

            JSONArray data = object.getJSONArray("data");


            for (int i = 0; i < data.length(); i++) {

                Log.d("CodeKamp", data.getJSONObject(i).getString("name"));
            }




        } catch (Exception e) {
            Log.d("CodeKamp", e.getMessage());
        }

    }
}
