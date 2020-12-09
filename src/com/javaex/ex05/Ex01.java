package com.javaex.ex05;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set --> HashSet
		Set<Integer> iSet = new HashSet<Integer>();
		
//		Integer i01 = new Integer(3);
//		Integer i03 = 3;	//박싱
		System.out.println("==================   add()  ==================");
		//추가 add()
		iSet.add(3);
		iSet.add(5);
		iSet.add(8);
		
		System.out.println("==================toString()==================");
		//toString()
		System.out.println(iSet.toString());
		
		System.out.println("==================  size()  ==================");
		//size()
		System.out.println(iSet.size());
		
		System.out.println("=================향상된 for문=================");
		//출력 : 
		//기존 for문은 사용할 수 없다.
		//다른 for문 --> 향상된 for문
		for(Integer i : iSet) {	//전체를 하나씩 꺼내쓸때 담을 그릇 : 전체
			System.out.println(i.toString());
		}
		System.out.println("--------------------");
		for(int i : iSet) {	//언박싱 된다.
			System.out.println(i);
		}
		
		System.out.println("==================== 삭제 ====================");
		iSet.remove(3);
		for(Integer i : iSet) {
			System.out.println(i.toString());
		}
		
		System.out.println("============== 중복값추가(오류) ==============");
		//중복값추가(안들어감)
		iSet.add(8);
		for(Integer i : iSet) {
			System.out.println(i.toString());
		}
	}

}
