package javapractise;

import java.util.Scanner;

public class que33 {

	public que33() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sd=new Scanner(System.in);
		String name, address, email;
		long phoneNo;
		System.out.println("Enter your details");
		System.out.println("What is your name?");
		name = sd.nextLine();
		System.out.println("Enter your full address");
		address = sd.nextLine();
		System.out.println("enter your email");
		email=sd.nextLine();
		System.out.println("enter your phone number");
		phoneNo=sd.nextLong();
		
		
		System.out.println("Your Personal Details:");
		System.out.println("Name:"+name);
		System.out.println("Addredd:"+address);
		System.out.println("Email:"+email);
		System.out.println("Phone number:"+phoneNo);
		
		

	}

}
