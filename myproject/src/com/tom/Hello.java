package com.tom;

import java.util.Random;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person(1.3f, 22.5f);
		//p.height = 1.3f;
		//p.weight = 22.5f;
		p.hello();
		System.out.println(p.bmi());
		
		Score hank = new Score("Hank",80, 70);
		System.out.println(hank.name + "\t" + hank.english+ "\t" + hank.math);
		
	/*	Person hanktom = null;
		hanktom.hello();*/
		
		/*System.out.println("Hello world");
		String name = "Joyce";
		int age = 20;
		int height = 180;
		int weight = 30;
		System.out.println(age);*/
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println(name);
		
		float n = 12.3363f;
		String nick = "Joyce";
		System.out.printf("Hi,%s,Your age: %.2f\n",nick,n);
		
		System.out.println("Please enter temperature:");
		double c = scanner.nextDouble();
		System.out.println(c*(9.0/5)+32);
		System.out.println(c+" C = "+(double)(c*(9.0/5)+32)+" F");
		System.out.printf("%.1f C = %.1f F\n",c,c*(9.0/5)+32);
		
		Random random = new Random();
		int r = random.nextInt(100)+1;
		int max = 100;
		int min = 1;
		System.out.println(r);
		System.out.println("Please enter a number:");
		int n1 = scanner.nextInt();
		while(n1 != r) {
			if(n1>r) {
				max = n1;
				System.out.println(min+"~"+n1);
			}else{
				min = n1;
				System.out.println(n1+"~"+max);
			}
			n1 = scanner.nextInt();
		}
		System.out.println("BOOM!");
		
		
	}

}
