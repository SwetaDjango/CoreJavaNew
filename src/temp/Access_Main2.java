package temp;

import oopsconcepts.Access_Specifiers;

public class Access_Main2 {

	public static void main(String[] args) {
		
		Access_Specifiers ac2 = new Access_Specifiers();
		
		ac2.doThisPublic();
		//ac2.doThisDefault(); //Not allowed access level for default is only limited to package
		
		//ac2.doThisDefault();
		

	}

}
