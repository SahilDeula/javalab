package javapractise;

import java.util.Scanner;

public class que34 {

	public que34() {
		// TODO Auto-generated constructor stub
	}
		public void main(String[]args) {
			Scanner sasa =new Scanner(System.in);
			String bookName, authorName;
			int bookPrice, noOfPages;
			System.out.println("Details of book:");
			System.out.println("what is the name of book?");
			bookName=sasa.nextLine();
			System.out.println("what is the name of author");
			authorName=sasa.nextLine();
			System.out.println("what is the price of book?");
			bookPrice=sasa.nextInt();
			System.out.println("what is the noOfPage?");
			noOfPages=sasa.nextInt();
			
			System.out.println("Details of book:");
			System.out.println("BookName:"+bookName);
			System.out.println("AuthorName:"+authorName);
			System.out.println("BookPrice:"+bookPrice);
			System.out.println("NoOfPages:"+noOfPages);
			
			
	
	}
}
