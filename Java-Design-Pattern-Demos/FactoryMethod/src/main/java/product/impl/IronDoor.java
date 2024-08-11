package product.impl;

import product.Door;

public class IronDoor implements Door {

    private Double width;
    private Double height;

    public IronDoor(Double width, Double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public Double getWidth() {
        System.out.println("IronDoor.getWidth() called");
        return width;
    }

    @Override
    public Double getHeight() {
        System.out.println("IronDoor.getWidth() called");
        return height;
    }
}
