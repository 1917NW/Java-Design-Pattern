package pattern.container;

import pattern.File;

import java.util.ArrayList;
import java.util.List;

public class Folder implements File {
    String name;
    List<File> files = new ArrayList<File>();

    public Folder(String name) {
        this.name = name;
    }
    @Override
    public void showInfo() {
        System.out.println("Folder: " + name);
        for(File file : files) {
            file.showInfo();
        }
    }

    @Override
    public void add(File file) {
        files.add(file);
    }
}
