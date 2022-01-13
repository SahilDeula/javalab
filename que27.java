package javapractise;

public class que27 {

	public que27() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrayVar[] = {55, 66, 77, 89};
		for(int i = 0; i<4; i++)
		{
		for(int j = i+1; j<4; j++)
		{
		if(arrayVar[i] < arrayVar[j])
		{
		int temp = arrayVar[i];
		arrayVar[i] = arrayVar[j];
		arrayVar[j] = temp;
		}
		}
		}
		System.out.println("Second greatest number is: " + arrayVar[1]);
	}

}
