package in.codekamp.recylerviewdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cerebro on 17/06/16.
 */
public class Song {

    private static int totalSongs = 0;

    private int id;
    private String title;
    private String artist;

    public Song(String title, String artist) {
        totalSongs++;

        this.id = totalSongs;
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public static List<Song> allSongs() {
        List<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Saadgi","Nusrat Fateh Ali Khan"));
        songs.add(new Song("Sar Jhukaya toh pathar","Nusrat Fateh Ali Khan"));

        for (int i = 0; i < 100; i++) {
            songs.add(new Song("New song " + i,"Artist " + i));
        }

        songs.get(2);

        return songs;
    }
}
