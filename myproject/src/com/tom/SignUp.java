package com.tom;

import java.util.Scanner;

public class SignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Are you 18 ?(Y/N)");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		// boolean adult = line.equals("Y")||line.equals("y");
		boolean adult = line.equalsIgnoreCase("Y");
		if (adult) {
			System.out.println("age:");
			int age = scanner.nextInt();
			scanner.nextLine(); 
			//因使用者輸入age時按下的Enter會被當作name的輸入內容，因此用這行吸收Enter
			System.out.println("name:");
			String name = scanner.nextLine();
			System.out.println("nick name:");
			String nickName = scanner.nextLine();
			System.out.println("您的資料如下:" + age + "\t" + name + "\t" + nickName);
				} else {
					System.out.println("Bye");
				
		}System.out.println("adult:"+adult);
		
	}

}
