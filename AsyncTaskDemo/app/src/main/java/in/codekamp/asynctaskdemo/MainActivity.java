package in.codekamp.asynctaskdemo;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity implements ImageDownloader.CompletionListner {

    private EditText urlEditText;
    private ImageView downloadedImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        urlEditText = (EditText)findViewById(R.id.url_edittext);
        downloadedImageView = (ImageView) findViewById(R.id.downloaded_imageview);
    }


    public void download(View view) {
        ImageDownloader downloader = new ImageDownloader(this);

        downloader.execute(urlEditText.getText().toString());

        Log.d("CodeKamp", "Executing further code");
    }

    @Override
    public void doneDownloading(Drawable drawable) {
        Log.d("CodeKamp", "done downloading called");
        downloadedImageView.setImageDrawable(drawable);
    }
}
