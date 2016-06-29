package in.codekamp.kidsmaths;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class TableActivity extends AppCompatActivity implements TableFragment.Listner {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        Intent intent = getIntent();
        int tableOf = intent.getIntExtra("table_of", -1);
        int upto = intent.getIntExtra("upto", -1);

        Log.d("CodeKamp", "TableActivity. we have to show table of " + tableOf + " upto " + upto);

        FragmentManager manager = getSupportFragmentManager();

        if (manager.findFragmentByTag("abcd") == null) {
            TableFragment fragment = TableFragment.newInstance(tableOf, upto);

            FragmentTransaction transaction = manager.beginTransaction();
            transaction.add(R.id.fragment_container, fragment, "abcd");
            transaction.commit();
        }


    }

    public static Intent newIntent(Context context, int tableOf, int upto) {
        Intent intent = new Intent(context, TableActivity.class);

        intent.putExtra("table_of", tableOf);
        intent.putExtra("upto", upto);

        return intent;
    }

    @Override
    public void itemTapped(int position) {

    }
}
