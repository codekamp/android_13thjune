package in.codekamp.databaseconnectivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText todoEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        todoEditText = (EditText)findViewById(R.id.todo_edit_text);

        DatabaseHelper dbHelper = new DatabaseHelper(this);
        SQLiteDatabase db = dbHelper.getReadableDatabase();

        String[] columns = {"title", "completed"};
        Cursor cursor = db.query("todo", columns, null, null, null, null, null);

        ToDoCursor myCursor = new ToDoCursor(cursor);

        while(myCursor.moveToNext()) {

            Log.d("CodeKamp", "title: " + myCursor.getTitle());
            Log.d("CodeKamp", "Completed: " + myCursor.getCompleted());
        }

    }

    public void createTodo(View view) {
        String todo = todoEditText.getText().toString();

        DatabaseHelper dbHelper = new DatabaseHelper(this);
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        ContentValues data = new ContentValues();
        data.put("title", todo);
        data.put("completed", 0);

        db.insert("todo", null, data);
    }
}
