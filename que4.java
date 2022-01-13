package javapractise;

public class que4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age=50;
		//if(age>18)
		//System.out.println("the age is greater than 18");
		if(age>=10 && age<20){
			System.out.println("teenage");
		} 
		else if (age>=20 && age<=30) {
			System.out.println("young");
			
		}
		else if(age>30 && age<=50){
			System.out.println("adult");
		}
		else {
			System.out.println("dead");
		}

	}

}
