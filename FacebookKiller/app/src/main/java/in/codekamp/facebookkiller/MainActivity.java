package in.codekamp.facebookkiller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView emailTextView;
    private TextView passwordTextView;

    private static final int collegeSelectionRequest = 1;
    private static final int technologySelectionRequest = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        emailTextView = (TextView) findViewById(R.id.email_textview);
        passwordTextView = (TextView) findViewById(R.id.password_textview);
    }

    public void loginButtonClicked(View view) {

        Log.d("codekamp", "email is: " + emailTextView.getText());
        Log.d("codekamp", "password is: " + passwordTextView.getText());
    }

    public void selectCollege(View view) {
        Intent intent = CollegeSelectionActivity.getIntent(this);

        startActivityForResult(intent, collegeSelectionRequest);
    }

    public void selectTechnology(View view) {
        Intent intent = TechnologySelectionActivity.getIntent(this);

        startActivityForResult(intent, technologySelectionRequest);
    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == collegeSelectionRequest) {
            //handle data from CollegeSelectionActivity

            if(resultCode == CollegeSelectionActivity.success_code) {
                CharSequence collegeName = CollegeSelectionActivity.getCollegeName(data);
                emailTextView.setText(collegeName);
            } else if(resultCode == CollegeSelectionActivity.canceled_code) {
                //do nothing
            } else if(resultCode == CollegeSelectionActivity.not_found_code) {
                //send email to user
            }

        } else if(requestCode == technologySelectionRequest) {
            //handle data from TechnologySelectionActivity
        }
    }
}











