package product.door.impl;

import product.door.Door;

public class WoodenDoor implements Door {

    private Double width;
    private Double height;

    public WoodenDoor(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public Double getWidth() {
        return width;
    }

    @Override
    public Double getHeight() {
        return height;
    }
}
