package in.codekamp.notificationsdemo;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static  int notificationId = 0;

    private EditText messageEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        messageEditText = (EditText) findViewById(R.id.message_edit_text);
    }

    public void showNotification(View view) {

        notificationId++;

        Editable message = messageEditText.getText();

        Intent intent = new Intent(this, SecondActivity.class);

        PendingIntent pendingIntent = PendingIntent.getActivity(this, 1, intent, PendingIntent.FLAG_ONE_SHOT);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);

        builder.setContentIntent(pendingIntent);
        builder.setContentTitle("Downloading Pokemon Go!");
        builder.setContentText(message);
        builder.setSmallIcon(R.drawable.ic_launcher);
        builder.setOngoing(true);
        builder.setAutoCancel(true);
//        builder.addAction(R.drawable.ic_launcher,"next", pendingIntent);
//        builder.addAction(R.drawable.ic_launcher,"previous", pendingIntent);
//
//        NotificationCompat.BigTextStyle style = new NotificationCompat.BigTextStyle();
//
//        style.bigText("hlafhd hoahfoa hofahof aohf oahofahf oahodsf aofhao gfoagfaosdgf ogaofgasdo");
//        builder.setStyle(style);


        builder.setProgress(100,0,false);

        NotificationManager manager =
                (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        manager.notify(notificationId, builder.build());

        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            builder.setProgress(100,i*10,false);
            manager.notify(notificationId, builder.build());
        }

        builder.setProgress(0,0,false);
        builder.setOngoing(false);
        builder.setContentTitle("Pokemon Go download completed");

        manager.notify(notificationId, builder.build());
    }
}
