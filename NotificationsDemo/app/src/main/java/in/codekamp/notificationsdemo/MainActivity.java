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
        builder.setContentTitle("my awesome notifcation");
        builder.setContentText(message);
        builder.setSmallIcon(R.drawable.ic_launcher);
        builder.setAutoCancel(true);
        builder.addAction(R.drawable.ic_launcher,"view", pendingIntent);
        builder.addAction(R.drawable.ic_launcher,"reply", pendingIntent);

        NotificationCompat.BigTextStyle style = new NotificationCompat.BigTextStyle();

        style.bigText("hlafhd hoahfoa hofahof aohf oahofahf oahodsf aofhao gfoagfaosdgf ogaofgasdo");


        builder.setStyle(style);

        Notification notification = builder.build();

        NotificationManager manager =
                (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        manager.notify(notificationId, notification);
    }
}
