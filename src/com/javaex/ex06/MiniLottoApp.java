package com.javaex.ex06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MiniLottoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//로또 번호생성기 --> 중복체크 포함
		Set<Integer> lotto = new HashSet<Integer>();
		int num;
		int result = 0; 
				
		while(lotto.size() < 6) {
			num =  (int)(Math.random() * 45) + 1;
			lotto.add(num);
		}
		
		for(int i : lotto) {
			System.out.print(i + "\t");
		}
		
//		List<Integer> lottoList = new ArrayList<Integer>(lotto);
//		
//		for(int i=0; i < lottoList.size(); i++) {
//			result = lottoList.get(i);
//			System.out.print(result + "\t");
//		}
	
	}

}
