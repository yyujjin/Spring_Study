package com.lgy.spring_ex2_1;

public class Circle {

	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	public double Cal() {
		return 3.14*(radius*radius);
	}
	
}
