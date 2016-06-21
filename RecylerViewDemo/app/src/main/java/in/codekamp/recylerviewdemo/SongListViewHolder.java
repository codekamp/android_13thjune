package in.codekamp.recylerviewdemo;

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

    public SongListViewHolder(View itemView) {
        super(itemView);

        titleTextView = (TextView) itemView.findViewById(R.id.song_title_textview);
        albumTextView = (TextView) itemView.findViewById(R.id.song_album_textview);

        itemView.setOnClickListener(this);
    }

    public void bindSong(Song song) {
        this.currentSong = song;
        titleTextView.setText(song.getTitle());
        albumTextView.setText(song.getArtist());
    }

    @Override
    public void onClick(View v) {
        Log.d("CodeKamp","Row clicked for song " + this.currentSong.getTitle());
    }
}
