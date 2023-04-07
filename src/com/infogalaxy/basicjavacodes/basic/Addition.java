package com.infogalaxy.basicjavacodes.basic;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0,b = 0,c=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 2 Numbers:");
		a = sc.nextInt();
		b = sc.nextInt();
		c=a+b;
		System.out.println("Addition="+c);
	}

}
