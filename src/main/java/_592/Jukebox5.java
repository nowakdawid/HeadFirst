package _592;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class Jukebox5 {

    ArrayList<Song> songList = new ArrayList<Song>();

    public static void main(String[] args) {
        new Jukebox5().go();
    }

    class ArtistCompare implements Comparator<Song> {
        public int compare(Song one, Song two) {
            return one.getArtist().compareTo(two.getArtist());
        }
    }

    public void go() {
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
        /*ArtistCompare artistCompare = new ArtistCompare();
        Collections.sort(songList, artistCompare);
        System.out.println(songList);*/
        TreeSet<Song> songSet = new TreeSet<Song>();
        songSet.addAll(songList);
        System.out.println(songSet);
    }

    void getSongs() {
        try {
            File file = new File("SongList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {
                addSong(line);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    void addSong(String lineToParse) {
        String[] tokens = lineToParse.split("/");
        songList.add(new Song(tokens[0],tokens[1]));
    }

}
