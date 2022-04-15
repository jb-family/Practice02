package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("출력되는 내용을 입력하세요");
	System.out.print("기호 :");
	String sign = sc.nextLine();
	
	System.out.print("숫자1 :");
	int num = sc.nextInt();
	
	System.out.print("숫자2 :");
	int num1 = sc.nextInt();
	
	double plus = num + num1;
	double mius = num - num1;
	double multi = num * num1;
	double div = num / (double)num1;
	
	if(sign.equals("+")) {
		System.out.println("결과는 " + plus);
	}else if (sign.equals("-")) {
		System.out.println("결과는 " + mius);
	}else if (sign.equals("*")) {
		System.out.println("결과는 " + multi);
	}else if (sign.equals("/")) {
		if((num1 != 0))
		System.out.println("결과는 " + div);
		else {
			System.out.println("계산할 수 없습니다.");
		}
	}else {
		System.out.println("계산할 수 없는 기호입니다.");
	}
	// .equals은 ppt에서 안나왔으나.. 검색하여 결과 값 산출....
	
	sc.close();
	}
}
