package in.codekamp.recylerviewdemo;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * Created by cerebro on 20/06/16.
 */
public class SongListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private Song currentSong;

    private TextView titleTextView;
    private TextView albumTextView;
    private SongListViewHolderClickListner listner;

    public SongListViewHolder(View itemView, SongListViewHolderClickListner listner) {
        super(itemView);

        this.listner = listner;
        titleTextView = (TextView) itemView.findViewById(R.id.song_title_textview);
        albumTextView = (TextView) itemView.findViewById(R.id.song_album_textview);
        this.itemView.setOnClickListener(this);
    }

    public void bindSong(Song song) {
        this.currentSong = song;
        titleTextView.setText(song.getTitle());
        albumTextView.setText(song.getArtist());
    }

    @Override
    public void onClick(View v) {
        if(this.listner.isSongSelected(currentSong)) {
            this.itemView.setBackgroundColor(Color.parseColor("#00FF00"));
        }else {
            this.itemView.setBackgroundColor(Color.parseColor("#FF0000"));
        }
        this.listner.songClicked(this.currentSong);
    }

    public interface SongListViewHolderClickListner {
        public void songClicked(Song song);
        public boolean isSongSelected(Song song);
    }
}
