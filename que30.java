package javapractise;

import java.util.Scanner;

public class que30 {

	public que30() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0, n;
		Scanner sr= new Scanner(System.in);
		System.out.print("Enter a number to search: ");
		n = sr.nextInt();
		int arrayVar[] = {2, 6, 17, 9, 15, 9, 4, 7, 9, 2, 9};
		for(int i = 0; i < arrayVar.length; i++){
		if(n == arrayVar[i])
		count++;
		}
		if(count!=0)
		System.out.println(n + " is in array and repeated " + count + " times.");
		else
		System.out.println(n + " is not in array.");

	}

}
