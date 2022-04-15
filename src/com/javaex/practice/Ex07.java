package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int share = sc.nextInt();	//몫
		//int remain =sc.nextInt();	//나머지
		
		System.out.print("첫번째 숫자 :");
		int num = sc.nextInt();
		System.out.print("두번째 숫자 :");
		int num1 = sc.nextInt();
		
		int share = num / num1;
		int remain = num % num1;
		int shareChange = num1 / num;
		int remainChange = num1 % num;
		if(num > num1) {
			System.out.println("몫 :" + share);
			System.out.println("나머지 :" + remain);
		} else if(num < num1) {
			System.out.println("몫 :" + shareChange);
			System.out.println("나머지 :" + remainChange);
		} else {
			System.out.println("몫 :" + num / num1);
			System.out.println("나머지 :" + num % num1);
		}
		
		
		
		sc.close();
	}
}
