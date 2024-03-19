package com.assignement;

import java.util.Scanner;

public class Student {
	private String name;
	private int roll_No;
	private String grade;
	
	public void getStudentDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Name	:	");
		this.name = sc.nextLine();
		System.out.print("Roll No	:	");
		this.roll_No = sc.nextInt();
		sc.nextLine();
		System.out.print("Grade :		");
		this.grade = sc.nextLine();
		sc.close();
		
	}
	public static void main(String[] args) {
		Student student = new Student();
		PrintDetails print =  new PrintDetails();
		student.getStudentDetails();
		print.printDetails(student.name, student.roll_No, student.grade);
		
	}

}
