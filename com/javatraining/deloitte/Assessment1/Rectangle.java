package com.javatraining.deloitte.Assessment1;

public class Rectangle extends Shape{
	double length = 0;
	double width = 0;
	
	public Rectangle() {
	}
	
	public Rectangle(double length, double width) {
		this.length=length;
		this.width=width;
	}
	@Override
	public double area() {
		return (length*width);
	}
	@Override
	public double volume() {
		return -1;
	}

	@Override
	public String toString() {
		return "Rectangle [Length=" + length + ", Width=" + width + ", Area=" + area() + "]";
	}
	
}
