package javapractise;

public class que6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int days =8;
		char ch='e';
		switch (days) {
		case 1 :
			System.out.println("sunday");
			break;
		case 2 :
			System.out.println("monday");
			break;
		case 3 :
			System.out.println("tuesday");
			break;
		case 7 :
			System.out.println("saturday");
			break;
		default: 
			System.out.println("invalid input");
		}
		switch(ch) {
		case 'a':
			System.out.println("this is a");
			break;
		case 'b':
			System.out.println("this is b");
			break;
		case 'c' :
			System.out.println("this is c");
			break;
			default:
				System.out.println("invalid ch");
				
	}
		
	}
}
