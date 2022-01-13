package javapractise;

public class que29 {

	public que29() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrayVar[] = {17, 16, 87, 99};
		for(int i = 0; i<4; i++)
		{
		for(int j = i+1; j<4; j++)
		{
		if(arrayVar[i] > arrayVar[j])
		{
		int temp = arrayVar[i];
		arrayVar[i] = arrayVar[j];
		arrayVar[j] = temp;
		}
		}
		}
		System.out.println("Second smallest number is: " + arrayVar[1]);

	}

}
