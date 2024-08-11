package color.impl;

import color.Color;

public class Yellow implements Color {
    @Override
    public void fill() {
        System.out.println("Yellow::fill()");
    }
}
