package in.codekamp.databaseconnectivity;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.widget.CursorAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cerebro on 07/07/16.
 */
public class ToDoCursor extends CursorWrapper {
    /**
     * Creates a cursor wrapper.
     *
     * @param cursor The underlying cursor to wrap.
     */
    public ToDoCursor(Cursor cursor) {
        super(cursor);
    }

    public Todo getToDo() {
        int titleIndex = this.getColumnIndex("title");
        int completedIndex = this.getColumnIndex("completed");

        return new Todo(this.getString(titleIndex), this.getInt(completedIndex));
    }

    public List<Todo> getAllToDos() {
        int currentPosition = this.getPosition();
        this.moveToFirst();

        List<Todo> allTodos = new ArrayList<>();

        while(true) {
            allTodos.add(this.getToDo());

            if(this.moveToNext()) {
                break;
            }
        }

        this.move(currentPosition);

        return allTodos;
    }
}
