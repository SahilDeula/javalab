package javapractise;

public class que21n22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		int sum=0;
		for(number=1; number<=100; number++)
		{
			int count=0;
			for(int i=2; i<=number/2; i++)
				
			{
				if(number%i==0)
				{
					count++;
					sum= sum+i;
					break;
				}
			}
			if(count == 0 && number != 1)
				System.out.print(sum + "\t");
		}	   
			
		}
	}


