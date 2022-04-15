package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 약수란 자기 자신을 나누어 떨어지는 수를 말한다. 16의 경우 1, 2, 4, 8, 16
		System.out.print("첫번째 숫자 :");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자 :");
		int num2 = sc.nextInt();
		int measure = (num1 % num2);
		int measure1 = (num2 % num1);
		
		if(num1 > num2) {
		if(measure < 1) {
			System.out.println(num2 + " 는(은) "+ num1 + " 의 약수 입니다.");
		} else {
			System.out.println(num2 + " 는(은) "+ num1 + " 의 약수가 아닙니다.");
		}
		}
		else if (num1 < num2) {
		if(measure1 > 1) {
			System.out.println(num1 + " 는(은) "+ num2 + " 의 약수 입니다.");
		} else {
			System.out.println(num1 + " 는(은) "+ num2 + " 의 약수가 아닙니다.");
		}
		
		}
		
		sc.close();
	}
}
