package in.codekamp.facebookkiller;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CollegeSelectionActivity extends AppCompatActivity {

    private EditText editText;
    public static final int canceled_code = 10;
    public static final int not_found_code = 11;
    public static final int success_code = 12;
    private static final String COLLEGE_NAME_EXTRA = "college_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        editText = (EditText) findViewById(R.id.college_edittext);
    }

    public static Intent getIntent(Context context) {
        Intent intent = new Intent(context, CollegeSelectionActivity.class);

        return intent;
    }

    public void done(View view) {
        CharSequence collegeName = editText.getText();

        Intent intent = getIntent();
        intent.putExtra(COLLEGE_NAME_EXTRA, collegeName);
        setResult(success_code, intent);
        finish();
    }

    public static CharSequence getCollegeName(Intent data) {
        return data.getCharSequenceExtra(COLLEGE_NAME_EXTRA);
    }
}
