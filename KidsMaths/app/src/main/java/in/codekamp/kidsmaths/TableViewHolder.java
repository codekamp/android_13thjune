package in.codekamp.kidsmaths;

import android.support.v4.content.Loader;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;



/**
 * Created by cerebro on 24/06/16.
 */
public class TableViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public int currentRowNumber;
    public TextView textView;
    private ClickListner listner;

    public TableViewHolder(View itemView) {
        super(itemView);

        textView = (TextView)itemView;
        textView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Log.d("CodeKamp", "Holder informed about click by TextView");
        textView.setText("clicked");
        this.listner.positionTapped(this.currentRowNumber);
    }

    public void setClickListner(ClickListner listner) {
        this.listner = listner;
    }

    public interface ClickListner {
        public void positionTapped(int position);
    }
}
