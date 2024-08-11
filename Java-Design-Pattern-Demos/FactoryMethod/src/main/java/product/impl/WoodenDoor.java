package product.impl;

import product.Door;

public class WoodenDoor implements Door {

    private Double width;
    private Double height;

    public WoodenDoor(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public Double getWidth() {
        System.out.println("WoodenDoor.getWidth() called");
        return width;
    }

    @Override
    public Double getHeight() {
        System.out.println("WoodenDoor.getHeight() called");
        return height;
    }
}
