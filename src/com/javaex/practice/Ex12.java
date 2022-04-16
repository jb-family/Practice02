package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {
//  	------------------------- 첫번째 방법 .equals() 메소드 이용 --------------------
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
	//  ------------------------- 두번째 방법 switch문 이용 --------------------
	/*
	switch (sign) {
	case "+" : System.out.println("결과는 " + plus);
	break;
	case "-" : System.out.println("결과는 " + mius);
	break;
	case "*" : System.out.println("결과는 " + multi);
	break;
	case "/" : if(num1 != 0) { System.out.println("결과는 " + div);
				}
				else {
					System.out.println("계산할 수 없습니다.");
					}
	break;
	default : System.out.println("계산할 수 없는 기호입니다.");
	}
	*/
	
	
	sc.close();
	}
}
