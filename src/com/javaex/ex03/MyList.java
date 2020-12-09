package com.javaex.ex03;

public class MyList<T> {
	//필드
	private T[] oArray;
	private int crtPos;
	
	//생성자
	public MyList() {
		oArray = (T[])(new Object[3]);
		crtPos = 0;
	}
	
	//메소드 g/s
	
	//메소드 일반
	public void add(T o) {
		oArray[crtPos] = o;
		crtPos++;
	}
	
	public T get(int index) {
		return oArray[index];
	}
	
	public int size() {
		return crtPos;
	}
}
