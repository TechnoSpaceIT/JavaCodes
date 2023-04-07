package com.infogalaxy.basicjavacodes.studentapi;

import java.util.Scanner;

public class StudentOperation {

	Student S = new Student();
	Scanner sc = new Scanner(System.in);
	
	public void setStudent() {
		System.out.println("Enter the Student ID:");
		S.setId(sc.nextInt());
		System.out.println("Enter the Student Name:");
		S.setName(sc.next());
		System.out.println("Enter the Fees:");
		S.setFees(sc.nextDouble());
	}
	public void getStudent() {
		System.out.println("Student ID:"+S.getId());
		System.out.println("Student Name:"+S.getName());
		System.out.println("Student Fees:"+S.getFees());
	}
	
}
