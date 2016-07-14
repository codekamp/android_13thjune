package in.codekamp.myapplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by cerebro on 11/07/16.
 */
public class NewFavoriteSongEvent {
    public final int songId;
    public final List<String> someRandomVar = new ArrayList<>();


    public NewFavoriteSongEvent(int songId) {
        this.songId = songId;
    }
}
