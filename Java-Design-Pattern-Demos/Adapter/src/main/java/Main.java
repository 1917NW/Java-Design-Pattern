import adapter.MP3PlayerAdapter;

public class Main {
    public static void main(String[] args) {
      MP3PlayerAdapter mp3PlayerAdapter = new MP3PlayerAdapter();
      mp3PlayerAdapter.play("mp3", "song.mp3");
    }
}
