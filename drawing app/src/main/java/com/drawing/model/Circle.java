package com.drawing.model;

public class Circle extends Shape {
    private int radius;

    public Circle(int x, int y, int radius, String color) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public Circle clone() {
        return new Circle(this.x, this.y, this.radius, this.color);
    }

    // Getters and setters for radius
}
