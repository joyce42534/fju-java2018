package com.tom;

import java.util.Scanner;

public class RangeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("請輸入一整數:");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		boolean range = number>(-3) && number<5;
		System.out.println(range);

	}

}
