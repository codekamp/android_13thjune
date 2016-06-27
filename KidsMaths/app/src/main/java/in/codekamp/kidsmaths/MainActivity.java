package in.codekamp.kidsmaths;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mTableOfEditText;
    private EditText mUptoEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTableOfEditText = (EditText)findViewById(R.id.edittext_table_of);
        mUptoEditText = (EditText)findViewById(R.id.edittext_upto);
    }

    public void displayTable(View view) {
        int tableOf = Integer.parseInt(mTableOfEditText.getText().toString());
        int upto = Integer.parseInt(mUptoEditText.getText().toString());

        Log.d("CodeKamp", "MainActivity. we have to show table of " + tableOf + " upto " + upto);

        Intent intent = TableActivity.newIntent(this, tableOf, upto);
        startActivity(intent);
    }
}
