package com.drawing.model;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height, String color) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(this.x, this.y, this.width, this.height, this.color);
    }

    // Getters and setters for width and height
}
