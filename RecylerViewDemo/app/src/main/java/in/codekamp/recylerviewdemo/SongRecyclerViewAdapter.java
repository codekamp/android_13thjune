package in.codekamp.recylerviewdemo;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by cerebro on 20/06/16.
 */
public class SongRecyclerViewAdapter extends RecyclerView.Adapter<SongListViewHolder> {


    @Override
    public SongListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.song_row, null);


        return new SongListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SongListViewHolder holder, int position) {
        Song song = Song.allSongs().get(position);

        holder.bindSong(song);
    }

    @Override
    public int getItemCount() {
        return Song.allSongs().size();
    }
}
