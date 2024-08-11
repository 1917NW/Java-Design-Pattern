package pattern.composite;

import pattern.File;

public class TextFile implements File {
    String name;

    public TextFile(String name) {
        this.name = name;
    }
    @Override
    public void showInfo() {
        System.out.println("Text File" + name);
    }

    @Override
    public void add(File file) {
        throw new UnsupportedOperationException();
    }
}
