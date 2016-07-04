package in.codekamp.asynctaskdemo;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import retrofit2.Retrofit;


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


        Intent intent = new Intent(this, ImageDownloaderService.class);
        intent.putExtra("image_url", urlEditText.getText().toString());
        startService(intent);

        Intent intent1 = new Intent(this, ImageDownloaderService.class);
        intent1.putExtra("image_url", "http://4.bp.blogspot.com/-lpA251Fsi0w/T7-WEcrYssI/AAAAAAAAAeQ/n8tsL2I_l-o/s1600/service_lifecycle_rdc.jpg");
        startService(intent1);
//
//        ImageDownloader downloader = new ImageDownloader(this);
//
//        downloader.execute(urlEditText.getText().toString());

        Log.d("CodeKamp", "Executing further code");
    }

    @Override
    public void doneDownloading(Drawable drawable) {
        Log.d("CodeKamp", "done downloading called");
        downloadedImageView.setImageDrawable(drawable);
    }

    @Override
    public void progressReport(int progress) {
        Intent intent = new Intent();

        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
    }
}

