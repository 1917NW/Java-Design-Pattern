import pattern.File;
import pattern.composite.MediaFile;
import pattern.composite.TextFile;
import pattern.container.Folder;

public class Main {
    public static void main(String[] args) {
        File textFile = new TextFile("text.txt");
        File mediaFile = new MediaFile("song.mp3");

        Folder folder = new Folder("Folder");
        folder.add(textFile);
        folder.add(mediaFile);

        folder.showInfo();
    }
}
