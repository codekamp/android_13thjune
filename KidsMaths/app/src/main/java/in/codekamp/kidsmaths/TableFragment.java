package in.codekamp.kidsmaths;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by cerebro on 24/06/16.
 */
public class TableFragment extends Fragment {

    private RecyclerView recyclerView;

    public TableFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_table, container, false);

        recyclerView = (RecyclerView)view.findViewById(R.id.table_recycler_view);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return view;
    }
}
