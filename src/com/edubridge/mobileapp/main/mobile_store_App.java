package com.edubridge.mobileapp.main;

import java.util.Scanner;

import com.edubridge.mobileapp.model.Mobile;
import com.edubridge.mobileapp.service.mobileService;
import com.edubridge.mobileapp.service.mobileServiceImpl;

public class mobile_store_App {
	public static void main(String[] args) {
		mobileService service =new mobileServiceImpl();
		Scanner sc= new Scanner(System.in);
		int option;
		do {System.out.println("wlecome to mobile store app");
		System.out.println("----------------------");
		System.out.println("1.display all mobiles");
		System.out.println("2.Add new mobile");
		System.out.println("3.update the mobile");
		System.out.println("4.delete the mobile");
		System.out.println("5.search mobile");
		System.out.println("0.exit");
		System.out.println("please select one option");
		option=sc.nextInt();
		switch (option) {
		case 1: {
			System.out.println("mobiles available in the store");
			
			service.displayMobiles().forEach(System.out::println);
			
			
		}break;
		case 2:{
			System.out.println("enter mobile brand :");
			String brand = sc.next();
			System.out.println("enter mobile color :");
			String color = sc.next();
			System.out.println("enter mobile camera :");
			String camera = sc.next();
			System.out.println("enter mobile ram :");
			String ram= sc.next();
			System.out.println("enter moile price :");
			float price= sc.nextFloat();
			Mobile m=new Mobile(brand, color, camera, ram, price);
		service.addmobile(m);	
			
			
			
			
			
		}break;
		case 3:{
		
			System.out.println("enter the brand from the store");
			String brand1 = sc.next();
			System.out.println("update your brand to:");
			String brand2=sc.next();
			
			Mobile m = new Mobile();
			m.setBrand(brand2);
			service.update(brand2, brand1);
			
			
			
		}break;
		case 4:{System.out.println("enter your mobile brand :");
		String brand =sc.next();
		Mobile n = new Mobile(brand, brand, brand, brand, option);
		service.removemobile(n);
			
		}break;
		case 5:{
			System.out.println("enter your brand :");
			String brand= sc.next();
		//	service.searchmobile(brand);
			Mobile m=service.searchmobile(brand);
			if(m!=null) {
				System.out.println("BRAND : "+m.getBrand());
				System.out.println("COLOR : "+m.getColor());
				System.out.println("CAMERA :"+m.getCamera());
				System.out.println("RAM :"+m.getRam());
				System.out.println("PRICE :"+m.getPrice());
			
			}else {
				System.out.println("mobile not found");
			}
		}break;
		case 0:{
			System.out.println("thank you for using our app.....");
		}break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + option);
		}
			
		}while(option!=0);
	

		
	}

}
