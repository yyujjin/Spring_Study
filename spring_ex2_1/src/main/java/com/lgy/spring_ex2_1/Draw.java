package com.lgy.spring_ex2_1;

public class Draw {

	
		public static void main(String[] args) {
			Circle circle = new Circle();
			Rectangle rectangle = new Rectangle();
			
			circle.setRadius(10);
			System.out.println("원의 면적은 "+circle.Cal());
			rectangle.setWeight(20);
			rectangle.setHeight(30);
			System.out.println("사각형의 면적은 " + rectangle.cal());
			
		}
		
}
