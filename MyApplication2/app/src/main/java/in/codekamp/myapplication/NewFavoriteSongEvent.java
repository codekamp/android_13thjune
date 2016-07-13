package in.codekamp.myapplication;

/**
 * Created by cerebro on 11/07/16.
 */
public class NewFavoriteSongEvent {
    public final int songId;


    public NewFavoriteSongEvent(int songId) {
        this.songId = songId;
    }
}
