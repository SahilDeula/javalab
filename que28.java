package javapractise;

public class que28 {
	
		// TODO Auto-generated constructor stub
		public static void main(String[] args){
			int arrayVar[] = {2, 56, 1, 99};
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
			System.out.println("Smallest elements is: " + arrayVar[0]);
	}
 

}
