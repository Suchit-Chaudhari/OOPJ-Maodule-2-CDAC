package com.assignement;

public class PrintDetails extends Student {
	void printDetails(String name, int roll, String grade) {
		
		System.out.printf("%-10s%-10d%-10s", name, roll, grade);
		
	}
	
}
