package app;

import java.util.Scanner;

import service.HotelService;

import serviceimple.HotelServiceImplementation;

public class HotelApp {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		HotelService h1 = new HotelServiceImplementation();
		System.out.println("=======================WELCOME TO MANAGEMENT SYSTEM=========================");
		while(true)
		{
			System.out.println("==================================  MENU  ===========================================");
			System.out.println("enter Your Option .....");
			System.out.println("1.detail\n2.Available room\n3.Allocate\n4.CheckOut\n5.Customer Information\n6.Total List\n7.Find ID\n8.7exit");
			int op =ip.nextInt();
			switch (op) {
			case 1: h1.roomdetail();
			break;
			case 2: h1.availableRoom();
			break;
			case 3:h1.allocateroom();
			break;
			case 4:h1.checkout();
			break;
			case 5:h1.customerinfo();
			break;
			case 6:h1.findAllCustomer();
			break;
			case 7:h1.getCustomerId();
			break;
			case 8:System.out.println("THANK YOU VISIT AGAIN!!!"); 
			System.exit(0);

			default: System.out.println("Invalid Option try again");
			break;
			}
		}

	}

}
