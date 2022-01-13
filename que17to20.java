package javapractise;

import java.util.Scanner;

public class que17to20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n1:");
		int n1=sc.nextInt();
		System.out.println("Enter n2:");
		int n2=sc.nextInt();
		
		
		int sum=0;
		
		for(int i=n1;i<=n2;i++) {
		if (i%2!= 0) { 
			//if (i%2==0) {
				sum=sum+i;

	}
//System.out.println(sum);
}
		System.out.println(sum);

}
}