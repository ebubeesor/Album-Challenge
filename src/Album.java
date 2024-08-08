import java.util.*;
public class Album {
    // write code here
    private String name, artist;
    private SongList songs;
    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }
    public boolean addSong(String title, int duration) {
        return songs.add(new Song(title, duration));
    }
    public boolean addToPlayList(int tracknum, LinkedList<Song> playlist) {
        Song song = songs.findSong(tracknum);
        if (song != null) {
            playlist.add(song);
            return true;
        }
        return false;
    }
    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song song = songs.findSong(title);
        if (song != null) {
            playlist.add(song);
            return true;
        }
        return false;
    }
    public static class SongList {
        private ArrayList<Song> songs;
        private SongList() {
            songs = new ArrayList<>();
        }
        private boolean add(Song newSong) {
            if (songs.contains(newSong)) {
                return false;
            }
            songs.add(newSong);
            return true;
        }
        private Song findSong(String title) {
            for (Song song : this.songs) {
                if (song.getTitle().equalsIgnoreCase(title)) {
                    return song;
                }
            }
            return null;
        }
        private Song findSong(int tracknum) {
            if (tracknum > this.songs.size()){
                return null;
            }
            return songs.get(tracknum-1);
        }
    }
}
