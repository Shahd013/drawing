package com.drawing.model;

	public abstract class Shape implements Cloneable {
	    protected int x;
	    protected int y;
	    protected String color;

	    public Shape(int x, int y, String color) {
	        this.x = x;
	        this.y = y;
	        this.color = color;
	    }

	    public abstract Shape clone();

	    // Getters and setters for x, y, and color
	}

