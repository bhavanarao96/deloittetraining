package com.javatraining.deloitte.Assessment1;

public class Sphere extends Shape implements Spatial {
	double radius = 0;
	
	public Sphere() {
	}
	
	public Sphere(double radius) {
		this.radius=radius;
	}
	@Override
	public double area() {
		return (4*Math.PI*radius*radius);
	}

	@Override
	public double volume() {
		return ((4/3)*Math.PI*radius*radius*radius);
	}

	@Override
	public String toString() {
		return "Sphere [Radius=" + radius + ", Area=" + area() + ", Volume=" + volume() + "]";
	}
	
}
