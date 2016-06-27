package in.codekamp.kidsmaths;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;


/**
 * Created by cerebro on 24/06/16.
 */
public class TableRecyclerViewAdapter extends RecyclerView.Adapter<TableViewHolder> implements TableViewHolder.ClickListner {

    private int tableOf;
    private int upto;
    private ClickListner listner;

    public TableRecyclerViewAdapter(int tableOf, int upto, ClickListner listner) {
        super();
        this.tableOf = tableOf;
        this.upto = upto;
        this.listner = listner;
    }

    @Override
    public TableViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        TableViewHolder holder = new TableViewHolder(inflater.inflate(android.R.layout.simple_list_item_1, null));
        holder.setClickListner(this);

        return holder;
    }

    @Override
    public void onBindViewHolder(TableViewHolder holder, int position) {
        holder.currentRowNumber = position;
        int multiplier = position + 1;
        int result = multiplier * this.tableOf;
        holder.textView.setText(this.tableOf + " X " + multiplier + " = " + result);
    }

    @Override
    public int getItemCount() {
        return this.upto;
    }

    @Override
    public void positionTapped(int position) {
        Log.d("CodeKamp", "Adapter informed about click by ViewHolder");
        this.listner.rowTapped(position);
    }

    public interface ClickListner {
        public void rowTapped(int position);
    }
}
