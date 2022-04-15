package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		int age = 15;
		/*
		if(0 < age < 18) {
			System.out.println("청소년입니다.");
		}
		 */	
		// 위 오류가 난 이유는 조건이 2개이기 때문이다. 조건을 여러개 하기 위해서는 연산자를 이용하면 된다.
		if(0 < age || age < 18) {
			System.out.println("청소년입니다.");
		}
	}

}
