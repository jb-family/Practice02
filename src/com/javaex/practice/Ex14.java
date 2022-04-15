package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수익을 입력해 주세요");
		System.out.print("금액 :");
		int pay = sc.nextInt();
		
		double tax = 0.09 * pay;
		double tax1 = 0.09 * 1000 + 0.18 * (pay - 1000);
		double tax2 = 0.09 * 1000 + 3000 * 0.18 + 0.27 * (pay -4000);
		double tax3 = 1000 * 0.09 + 3000 * 0.18 + 4000 * 0.27 + 0.36 * (pay - 8000);
		
		
		if(pay >= 0 && pay <= 1000) {
			System.out.print("소득세는 " + tax + " 입니다. ");
		}else if (pay > 1000 && pay <= 4000) {
			System.out.print("소득세는 " + tax1 + " 입니다. ");
		}else if (pay > 4000 && pay < 8000) {
			System.out.print("소득세는 " + tax2 + " 입니다. ");
		}else if (pay >= 8000) {
			System.out.print("소득세는 " + tax3 + " 입니다. ");
		}else if (pay < 0){
			System.out.print("잘못 입력했습니다.");
		}
		
		
		sc.close();
	}
}