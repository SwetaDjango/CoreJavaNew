package oopsconcepts;

public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars c1 = new Cars();// create a new instance = object
		
		
		c1.color = "Red";
		c1.make = "BMW";
		
		c1.displayDetails();
		
		/*
		 * Cars c2 = new Cars();
		 * 
		 * c2.color = "Orange"; c2.make = "Toyota"; c2.type = "Sadan";
		 * 
		 * c2.displayDetails();
		 */
		
		Cars obj2= new Cars();// 2nd instance /object
		
		obj2.color= "White";
		obj2.make="Mercedes";
		obj2.type="Sedan";
		
		obj2.displayDetails();
		
		Access_Specifiers ac2 = new Access_Specifiers();
		
		ac2.doThisDefault();
	}

}
