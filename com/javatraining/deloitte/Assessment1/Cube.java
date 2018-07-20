package com.javatraining.deloitte.Assessment1;

public class Cube extends Shape implements Spatial{
	double side = 0;
	
	public Cube() {
	}
	
	public Cube(double side) {
		this.side=side;
	}
	@Override
	public double area() {
		return (6*side*side);
	}
	@Override
	public double volume() {
		return (side*side*side);
	}

	@Override
	public String toString() {
		return "Cube [Side=" + side + ", Area=" + area() + ", Volume=" + volume() + "]";
	}

	
	
}
