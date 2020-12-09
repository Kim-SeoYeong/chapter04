package com.javaex.ex03;

public class ListApp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//범용 ObjList 사용하는데
		//메모리에 올릴때(new) 사각형 용으로 만들어버린다.
		MyList rList = new MyList<Rectangle>();
		
		Rectangle r01 = new Rectangle(5, 7);
		Rectangle r02 = new Rectangle(4, 10);
		
		rList.add(r01);
		rList.add(r02);
		
		for(int i=0; i < rList.size(); i++) {
			((Rectangle)(rList.get(i))).draw();
		}
		
		
		//범용 ObjList 사용하는데
		//메모리에 올릴때(new) 원 용으로 만들어버린다.
		MyList cList = new MyList<Circle>();
		
		Circle c01 = new Circle(5);
		Circle c02 = new Circle(10);
		
		cList.add(c01);
		cList.add(c02);
		
		for(int i=0; i < cList.size(); i++) {
			((Circle)(cList.get(i))).draw();
		}
		
		
		
		//범용 ObjList 사용하는데
		//메모리에 올릴때(new) 삼각형 용으로 만들어버린다.
		//MyList rList = new MyList<Triangle>();
	}

}
