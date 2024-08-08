public class Song {
    // write code here
    private String title, feature;
    private int duration;

    public Song(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public Song(String title, int duration, String feature) {
        super();
        this.feature = feature;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        int minutes = duration / 60;
        int seconds = duration % 60;
        return title + ": " + String.format("%d:%02d", minutes, seconds);
    }
}