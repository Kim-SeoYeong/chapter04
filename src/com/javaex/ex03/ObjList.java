package com.javaex.ex03;

public class ObjList {
	//필드
	private Object[] oArray;
	private int crtPos;
	
	//생성자
	public ObjList() {
		oArray = new Object[3];
		crtPos = 0;
	}
	
	//메소드 g/s
	
	//메소드 일반
	public void add(Object o) {
		oArray[crtPos] = o;
		crtPos++;
	}
	
	public Object get(int index) {
		return oArray[index];
	}
	
	public int size() {
		return crtPos;
	}
}
