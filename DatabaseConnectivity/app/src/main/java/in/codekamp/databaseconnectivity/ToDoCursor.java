package in.codekamp.databaseconnectivity;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.widget.CursorAdapter;

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

    public String getTitle() {
        int index = this.getColumnIndex("title");
        return this.getString(index);
    }

    public int getCompleted() {
        int index = this.getColumnIndex("completed");
        return this.getInt(index);
    }
}
