package com.tom;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person(1.3f, 22.5f);
		//p.height = 1.3f;
		//p.weight = 22.5f;
		p.hello();
		System.out.println(p.bmi());
		
		Score hank = new Score("Hank",80, 70);
		System.out.println(hank);
		
	/*	Person hanktom = null;
		hanktom.hello();*/
		
		
		
		/*System.out.println("Hello world");
		String name = "Joyce";
		int age = 20;
		int height = 180;
		int weight = 30;
		System.out.println(age);*/
		

	}

}
