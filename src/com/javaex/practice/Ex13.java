package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력해 주세요");
		System.out.print("숫자 :");
		int num = sc.nextInt();
		double result;
		
		
		if(num <= 0) {
			result = num * num * num -9 * (double)num + 2;
			System.out.println("계산결과는 " + result + " 입니다.");
		} else {
			result = 7 * (double)num + 2;
			System.out.println("계산결과는 " + result + " 입니다.");
		}
		
		
		
		sc.close();
	}
}
