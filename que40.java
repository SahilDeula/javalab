package javapractise;

public class que40 {
		// TODO Auto-generated constructor stub
		public static void main(String args[]){
			try{
			int data=25/0;
			System.out.println(data);
			}
			catch(ArithmeticException e){System.out.println(e);}
			finally{System.out.println("I am finally block I will always execute");}
			System.out.println("rest of the code...");
			
	}

}
