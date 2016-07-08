package in.codekamp.databaseconnectivity;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by cerebro on 08/07/16.
 */
public class Todo {
    private int id = 0;
    private String title;
    private int completed;

    public Todo(int id, String title, int completed) {
        this.title = title;
        this.completed = completed;
    }

    public Todo(String title, int completed) {
        this(0, title, completed);
    }

    public Todo() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCompleted() {
        return completed;
    }

    public void setCompleted(int completed) {
        this.completed = completed;
    }

    public void save(Context context) {
        DatabaseHelper helper = new DatabaseHelper(context);

        SQLiteDatabase db = helper.getWritableDatabase();

        if(this.id == 0) {
            // insert new row
        } else {
            // update existing row
        }
    }
}
