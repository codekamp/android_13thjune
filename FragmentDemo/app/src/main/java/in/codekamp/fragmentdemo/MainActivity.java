package in.codekamp.fragmentdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FragmentManager manager = getSupportFragmentManager();

        if(manager.findFragmentByTag("square_root") == null) {
            Fragment fragment = new SquareRootFragment();

            FragmentTransaction transaction = manager.beginTransaction();
            transaction.add(R.id.container1, fragment, "square_root");
            transaction.commit();
            Log.d("CodeKamp", "Fragment was added");
        } else {
            Log.d("CodeKamp", "Fragment was already there so not added again");
        }

        if (getSupportFragmentManager().getFragments() != null) {
            Log.d("CodeKamp", Integer.toString(manager.getFragments().size()));
        }
    }
}
