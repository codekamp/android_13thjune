package in.codekamp.savedinstancestatedemo;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText firstNumberEditText;
    private EditText secondNumberEditText;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumberEditText = (EditText)findViewById(R.id.first_number);
        secondNumberEditText = (EditText)findViewById(R.id.second_number);
        resultTextView = (TextView)findViewById(R.id.result_textview);

        String resultText = null;
        if (savedInstanceState != null) {
            resultText = savedInstanceState.getString("result");
        }

        if (resultText != null) {
            resultTextView.setText(resultText);
        }

        Log.d("CodeKamp", "OnCreate Called for MainActivity");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("CodeKamp", "OnStart Called for MainActivity");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("CodeKamp", "OnResume Called for MainActivity");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("CodeKamp", "OnPause Called for MainActivity");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("CodeKamp", "onStop Called for MainActivity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("CodeKamp", "onDestroy Called for MainActivity");
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("CodeKamp", "onSaveInstanceState Called for MainActivity");

        outState.putString("result", resultTextView.getText().toString());
    }

    public void calculate(View view) {
        int firstNumber = Integer.parseInt(firstNumberEditText.getText().toString());
        int secondNumber = Integer.parseInt(secondNumberEditText.getText().toString());

        int result = firstNumber * secondNumber;

        resultTextView.setText(Integer.toString(result));
    }
}
