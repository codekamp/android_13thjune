package in.codekamp.asynctaskdemo;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.Image;
import android.os.AsyncTask;
import android.os.Build;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by cerebro on 28/06/16.
 */
public class ImageDownloader extends AsyncTask<String, Integer, Drawable> {

    private CompletionListner listner;

    public ImageDownloader(CompletionListner listner) {
        super();

        this.listner = listner;
    }


    @Override
    protected Drawable doInBackground(String... params) {


        try {
            URL url = new URL(params[0]);

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            publishProgress(10);

            return Drawable.createFromStream(connection.getInputStream(),"drawable_name");


        } catch (Exception e) {
        }

        return null;

    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);

        this.listner.progressReport(values[0]);
    }

    @Override
    protected void onPostExecute(Drawable image) {
        super.onPostExecute(image);

        this.listner.doneDownloading(image);
    }

    // http://it-ebooks.directory/book-1785883267.html

    public interface CompletionListner {
        public void doneDownloading(Drawable drawable);
        public void progressReport(int progress);
    }
}
