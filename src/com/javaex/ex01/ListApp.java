package com.javaex.ex01;

public class ListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//사각형은 사각형끼리
		//원은 원끼리
		//삼각형은 삼각형끼리
		
		//사각형 관리
		RectList rList = new RectList();

		Rectangle r01 = new Rectangle(3, 9);
		Rectangle r02 = new Rectangle(12, 15);
		
		rList.add(r01);
		rList.add(r02);
		
		Rectangle r100 = rList.get(0);
		r100.draw();
		
		for(int i = 0; i < rList.size(); i++) {
			/*
			Rectangle r = rList.get(i);
			r.draw();
			*/
			rList.get(i).draw();
		}
		
		System.out.println(rList.size() + " 개");
		
		//원 관리
		CircleList cList = new CircleList();
		
		Circle c01 = new Circle(5);
		Circle c02 = new Circle(8);
		Circle c03 = new Circle(4);
		
		cList.add(c01);
		cList.add(c02);
		cList.add(c03);
		
		Circle c04 = cList.get(1);
		c04.draw();
		
		System.out.println(cList.size() + " 개");
		
		//삼각형 관리
		TriangleList tList = new TriangleList();
		
		Triangle t01 = new Triangle(4, 12);
		Triangle t02 = new Triangle(3, 6);
		Triangle t03 = new Triangle(2, 3);
		
		tList.add(t01);
		tList.add(t02);
		tList.add(t03);
		
		Triangle t04 = tList.get(2);
		t04.draw();
		
		System.out.println(tList.size() + " 개");
	}

}
