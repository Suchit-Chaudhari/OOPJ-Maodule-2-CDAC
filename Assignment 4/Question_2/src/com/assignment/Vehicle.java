package com.assignment;

import java.util.Scanner;

public class Vehicle {
	private String type;
	private String color;
	private int price;
	
	public void getDetails() {
		try(Scanner sc = new Scanner(System.in)) {
			
			System.out.print("Type	:	");
			this.type = sc.nextLine();
			System.out.print("Color	:	");
			this.color = sc.nextLine();
			System.out.print("Price	:	");
			this.price = sc.nextInt();
			
			
		}
	}
		
	
    public void vehicleType() {
        System.out.println("Your vehicle type is:	Car" );
    }
		
    public void vehicleType(String type) {
    	System.out.println("Your Vehicle is		:	"+type);
    	
    }
    
    public void  vehicleType(String type, String color) {
    	System.out.println("your vehicle is		:	"+color +" "+type);
    }
    
    public void vehicleType(String type, String color, int price) {
    	System.out.println("your vehicle is		:	"+color +" "+type+" with price of "+price);
    }
		
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.getDetails();
		vehicle.vehicleType();
		vehicle.vehicleType(vehicle.type);
		vehicle.vehicleType(vehicle.type, vehicle.color);
		vehicle.vehicleType(vehicle.type, vehicle.color, vehicle.price);
		
	}
	
}
