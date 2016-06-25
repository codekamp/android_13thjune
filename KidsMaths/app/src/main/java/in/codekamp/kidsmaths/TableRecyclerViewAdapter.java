package in.codekamp.kidsmaths;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/**
 * Created by cerebro on 24/06/16.
 */
public class TableRecyclerViewAdapter extends RecyclerView.Adapter<TableViewHolder> {

    private int tableOf;
    private int upto;

    public TableRecyclerViewAdapter(int tableOf, int upto) {
        super();
        this.tableOf = tableOf;
        this.upto = upto;
    }

    @Override
    public TableViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        return new TableViewHolder(inflater.inflate(android.R.layout.simple_list_item_1, null));
    }

    @Override
    public void onBindViewHolder(TableViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return this.upto;
    }
}
