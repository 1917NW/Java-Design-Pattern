package pattern.composite;

import pattern.File;

public class MediaFile implements File {
    String name;

    public MediaFile(String name) {
        this.name = name;
    }

    @Override
    public void showInfo() {
        System.out.println("Media File" + name );
    }

    @Override
    public void add(File file) {
        throw new UnsupportedOperationException();
    }
}
