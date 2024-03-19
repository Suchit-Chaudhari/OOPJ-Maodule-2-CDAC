package com.assignment;

import java.util.Scanner;

public class Employee {
	private String name;
	private int EMP_id;
	private float salary;
	private Scanner sc = new Scanner(System.in);
	
	public void acceptRecord() {		
		System.out.print("name	:	");
		this.name = this.sc.nextLine();
		System.out.print("EMP_Id	:	");
		this.EMP_id = this.sc.nextInt();
		System.out.print("Salary	:	");
		this.salary = this.sc.nextFloat();
		sc.nextLine();
	}
	
	public void printRecord(String name) {
		System.out.println("name	:	"+name);
		
	}
	public void printRecord(String name, int ID) {
		System.out.println("name	:	"+name);
		System.out.println("EMP_Id	:	"+ID);
		
	}
	
	public void printRecord(String name, int ID, float salary) {
		System.out.println("name	:	"+name);
		System.out.println("EMP_Id	:	"+ID);
		System.out.println("Salary	:	"+salary);
		
	}
	
	public void menuList() {
		int input = -1;
		while(input!=0) {
			System.out.println("Enter Option");
			System.out.println("Exit	:	0");
			System.out.println("Accept Record	:	1");
			System.out.println("Print Record	:	2");
			input = sc.nextInt();
			sc.nextLine();
			if(input==1) {
				this.acceptRecord();
			}
			else if(input==2) {
				this.printRecord(this.name, this.EMP_id, this.salary);
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.menuList();
	}
}
