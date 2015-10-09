package _592;

public class Song implements Comparable<Song> {

    String title;
    String artist;

    public boolean equals (Object aSong) {

        Song s = (Song) aSong;
        return getTitle().equals(s.getTitle());

    }

    public int hashCode() {
        return title.hashCode();
    }

    public int compareTo(Song s) {
        return title.compareTo(s.getTitle());
    }

    Song(String t, String a) {
        title = t;
        artist = a;
    }

    public String getTitle() {
        return title;
    }
    public String getArtist() {
        return artist;
    }
    public String toString() {
        return title;
    }

}
