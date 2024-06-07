package com.lgy.spring_ex2_1;

public class Rectangle {

	private int weight;
	private int height;
	
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int cal() {
		return height*weight;
	}
	
}
