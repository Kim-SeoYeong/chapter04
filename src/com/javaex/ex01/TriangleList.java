package com.javaex.ex01;

public class TriangleList {
	//필드
	private Triangle[] tArray;
	private int crtPos;
	//생성자
	public TriangleList() {
		tArray = new Triangle[3];	//tArray 크기 
		crtPos = 0;	//crtPos 초기화
	}
	
	public void add(Triangle t) {
		tArray[crtPos] = t;
		crtPos++;
	}
	
	public Triangle get(int index) {
		return tArray[index];
	}
	
	public int size() {
		return crtPos;
	}
}
