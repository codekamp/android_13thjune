package in.codekamp.recylerviewdemo;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by cerebro on 20/06/16.
 */
public class SongRecyclerViewAdapter extends RecyclerView.Adapter<SongListViewHolder> implements SongListViewHolder.SongListViewHolderClickListner {

    List<Song> selectedSongs = new ArrayList<>();

    @Override
    public SongListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.song_row, null);

        return new SongListViewHolder(view, this);
    }

    @Override
    public void onBindViewHolder(SongListViewHolder holder, int position) {
        Song song = Song.allSongs().get(position);

        holder.bindSong(song);

        if (isSongSelected(song)) {
            holder.itemView.setBackgroundColor(Color.parseColor("#FF0000"));
        } else {
            holder.itemView.setBackgroundColor(Color.parseColor("#00FF00"));
        }
    }

    @Override
    public int getItemCount() {
        return Song.allSongs().size();
    }

    @Override
    public void songClicked(Song song) {
        if (isSongSelected(song)) {
            selectedSongs.remove(song);
        } else {
            selectedSongs.add(song);
        }
    }

    @Override
    public boolean isSongSelected(Song song) {
        return selectedSongs.contains(song);
    }
}
