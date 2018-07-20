package com.javatraining.deloitte.Assessment1;

public class Triangle extends Shape{
	double base = 0;
	double height = 0;
	
	public Triangle() {
	}
	
	public Triangle(double base, double height) {
		this.base=base;
		this.height=height;
	}
	@Override
	public double area() {
		return (0.5*base*height);
	}
	@Override
	public double volume() {
		return -1;
	}

	@Override
	public String toString() {
		return "Triangle [Base=" + base + ", Height=" + height + ", Area=" + area() + "]";
	}
	
}
