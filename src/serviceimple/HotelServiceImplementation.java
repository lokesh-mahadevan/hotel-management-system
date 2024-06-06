package serviceimple;
import java.util.LinkedHashMap;
import java.util.Scanner;

import dao.Hotelrepos;
import entity.Customer;
import service.HotelService;

public class HotelServiceImplementation implements HotelService,Hotelrepos{
	{
		for(int i=1;i<=10;i++)
		{
			cm.put(i, null);
		}

		for(int i=1;i<=8;i++)
		{
			sm.put(i, null);
		}
		for(int i=1;i<=5;i++)
		{
			dm.put(i, null);
		}
	}
	Scanner ip = new Scanner(System.in);

	@Override
	public void roomdetail() {
		System.out.println("================Classic Rooms====================");
		System.out.println("Hot water:yes");
		System.out.println("AC: NO");
		System.out.println("TV : NO ");
		System.out.println("Wifi : NO");
		System.out.println("Price: 2000 Rs");
		System.out.println("================Standard Rooms====================");
		System.out.println("Hot water:yes");
		System.out.println("AC: NO");
		System.out.println("TV : YES ");
		System.out.println("Wifi : NO");
		System.out.println("Price: 2500 Rs");
		System.out.println("================Deluxe Rooms====================");
		System.out.println("Hot water:yes");
		System.out.println("AC: YES");
		System.out.println("TV : YES ");
		System.out.println("Wifi : YES");
		System.out.println("Price: 3500 Rs");

	}
	public void checkroom(LinkedHashMap<Integer, Customer> l1)
	{
		boolean flag = false;
		for(Integer ele:l1.keySet())
		{
			if(l1.get(ele)==null)
			{				System.out.println(ele+" ");
				flag = true;
			}
		}
		System.out.println();
		if(flag==false)
		{
			System.out.println("No Rooms Are Available ");
		}
	}

	@Override
	public void availableRoom() {
		System.out.println("=========================Available Room=======================");
		System.out.println("========================Classic Rooms=========================");
		checkroom(cm);
		System.out.println("========================Standard Rooms=========================");
		checkroom(sm);
		System.out.println("========================Deluxe Rooms=========================");
		checkroom(dm);
	}
	Customer createcustomer()
	{
		System.out.println("========Customer Detail=========");
		System.out.println("enter Customer name :-");
		String cname=ip.next();
		System.out.println("enter Customer id :-");
		int cid=ip.nextInt();
		System.out.println("enter Customer Phone Number :-");
		long cphno=ip.nextLong();
		System.out.println("enter Customer mail :-");
		String cmail=ip.next();
		System.out.println("enter Customer pan number :-");
		String cpan=ip.next();
		System.out.println("enter Customer Doorno :-");
		int cdno=ip.nextInt();
		System.out.println("enter Customer street :-");
		String cstr=ip.next();
		System.out.println("enter Customer dst :-");
		String cdst=ip.next();
		System.out.println("enter Customer state :-");
		String csta=ip.next();
		System.out.println("enter Customer Country:-");
		String cc=ip.next();
		System.out.println("enter Customer pincode:-");
		int cp=ip.nextInt();
		return new Customer(cname, cid, cphno, cmail, cpan, cdno, cstr, cdst, csta, cc, cp);
	}
	void mapRoom(LinkedHashMap<Integer, Customer> l1, int roomNo,double amt)
	{
		if(l1.get(roomNo)==null)
		{
			Customer c =createcustomer();
			a1.add(c);
			l1.put(roomNo, c);
			c.setCamt(amt);
			System.out.println("Customer name "+c.getCname()+" customer id "+c.getCid()+"Phone number "+c.getCphno()+" Email "+c.getCemail()+" Address "+c.getCaddress()+" Pan card "+c.getCpan()+" Cash Paid "+c.getCamt());

		}
		else {
			System.out.println("Room not available...!!");

		}

	}
	@Override
	public void allocateroom() {
		System.out.println("please what Room do you needed ?");
		System.out.println("==========menu================");
		System.out.println("1.Classic Room\n2.Standard Room\n3.Deluxe Room");

		int op=ip.nextInt();
		switch (op) {
		case 1:System.out.println("Enter the room number :-");
		int roomNo1=ip.nextInt();
		if(roomNo1>=1&&roomNo1<=10)
		{
			mapRoom(cm, roomNo1,2000);
		}
		else {
			System.out.println("Enter correct Room no..");
		}

		break;
		case 2:System.out.println("Enter the room number :-");
		int roomNo2=ip.nextInt();
		if(roomNo2>=1&&roomNo2<=8)
		{
			mapRoom(sm, roomNo2,2500);
		}
		else {
			System.out.println("Enter correct Room no..");
		}
		break;
		case 3:System.out.println("Enter th eroom number :-");
		int roomNo3=ip.nextInt();
		if(roomNo3>=1&&roomNo3<=5)
		{
			mapRoom(dm, roomNo3,3500);
		}
		else {
			System.out.println("Enter correct Room no..");
		}
		break;

		default:System.out.println("Invaild Option!...");
		break;
		}

	}
	void unmaproom(LinkedHashMap<Integer,Customer> l1,int roomNo)
	{
		if(l1.get(roomNo)!=null)
		{
			Customer c1=l1.get(roomNo);
			System.out.println(c1);
			System.out.println(c1.getCname()+ " need to pay "+c1.getCamt());
			l1.put(roomNo, null);
		}
		else
		{
			System.out.println("Invalid roomNo");
		}
	}
	public void checkout()
	{
		System.out.println("please tell me your room ");
		System.out.println("==========menu================");
		System.out.println("1.Classic Room\n2.Standard Room\n3.Deluxe Room");
		int op=ip.nextInt();
		System.out.println("Enter the room number :-");
		int roomNo=ip.nextInt();
		switch (op) {
		case 1:if(roomNo>=1&&roomNo<=10)
		{
			unmaproom(cm, roomNo);
		}
		else {
			System.out.println("Enter correct Room no..");
		}

		break;
		case 2:if(roomNo>=1&&roomNo<=8)
		{
			unmaproom(sm, roomNo);
		}
		else {
			System.out.println("Enter correct Room no..");
		}
		break;
		case 3:if(roomNo>=1&&roomNo<=5)
		{
			unmaproom(dm, roomNo);
		}
		else {
			System.out.println("Enter correct Room no..");
		}
		break;

		default:System.out.println("Invaild Option!...");
		break;
		}
	}		
	public void customerinfo()
	{
		System.out.println("please tell your number or Id");
		System.out.println("1)phone number\n2)ID number");
		int op = ip.nextInt();
		boolean flag = false;
		System.out.println("tell the number ");
		switch (op) {
		case 1:
			long phno= ip.nextLong();
			for(Customer ele: a1)
			{
				if(ele.getCphno()==phno)
				{
					System.out.println(ele);
					flag = true;
					break;
				}	
			}
			if(flag==false)
			{
				System.out.println("Invalid number");
			}
		case 2:
			int cid= ip.nextInt();
			for(Customer ele: a1)
			{
				if(ele.getCid()==cid)
				{
					System.out.println(ele);
					flag = true;
					break;
				}
			}
			if(flag==false)
			{
				System.out.println("Invalid number");
			}
		}
	}
	@Override
	public void findAllCustomer() {
		if(a1.size()==0)
		{
			System.out.println("Database is Empty!...");
		}
		else
		{
			for(Customer ele: a1)
			{
				System.out.println(ele+" ");
			}
		}

	}
	@Override
	public void getCustomerId() {
		boolean flag = false;
		System.out.println("enter the Customer Id ");
		int cid = ip.nextInt();
		for(Customer ele: a1)
		{
			if(ele.getCid()==cid)
			{
				System.out.println(ele);
				flag = true;
				break;
			}

		}
		if(flag==false)
		{
			System.out.println("Invalid Id...!!");
		}

	}



}
