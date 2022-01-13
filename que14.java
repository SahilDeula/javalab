package javapractise;

import java.util.Scanner;

public class que14 {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n1:");
		int n1=sc.nextInt();
		System.out.println("Enter n2:");
		int n2=sc.nextInt();
		int num,sum=0;
		
		for(num=n1; num<=n2; num++)
		{
			int count=0;
			for(int i=2; i<=num/2; i++)
			{
				if(num%i==0)
				{
					count++;
					break;
				}
			}
			if(count == 0 && num != 1)
				sum+=num;
				System.out.print("Sum of prime number between " + n1+ " to " + n2 + " is " + sum );
	
	}

}
}