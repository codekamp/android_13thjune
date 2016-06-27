package in.codekamp.kidsmaths;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by cerebro on 24/06/16.
 */
public class TableFragment extends Fragment implements TableRecyclerViewAdapter.ClickListner {

    private RecyclerView recyclerView;

    private int tableOf;
    private int upto;
    public Listner listner;

    public TableFragment() {

    }


    public static TableFragment newInstance(int tableOf, int upto) {
        TableFragment fragment = new TableFragment();

        Bundle bundle = new Bundle();
        bundle.putInt("table_of", tableOf);
        bundle.putInt("upto", upto);

        fragment.setArguments(bundle);

        return fragment;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle bundle = getArguments();
        this.tableOf = bundle.getInt("table_of");
        this.upto = bundle.getInt("upto");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_table, container, false);

        recyclerView = (RecyclerView)view.findViewById(R.id.table_recycler_view);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(new TableRecyclerViewAdapter(this.tableOf, this.upto, this));

        return view;
    }

    @Override
    public void rowTapped(int position) {
        Log.d("CodeKamp", "Fragmetn informed about click by Adapter");
    }

    public interface Listner {
        public void itemTapped(int position);
    }
}
