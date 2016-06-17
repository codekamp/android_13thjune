package in.codekamp.facebookkiller;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TechnologySelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technology_selection);
    }

    public static Intent getIntent(Context context) {
        Intent intent = new Intent(context, TechnologySelectionActivity.class);

        return intent;
    }
}
