package testpackage;

/*What is the Difference Between i++ and ++i in Java?
Last Updated : 07 Jan, 2021
++i and i++ both increment the value of i by 1 but in a different way. If ++ precedes the variable,
it is called pre-increment operator and it comes after a variable, it is called post-increment operator.

Increment in java is performed in two ways,

1) Post-Increment (i++): we use i++ in our statement if we want to use the current value,
 and then we want to increment 
the value of i by 1.

2) Pre-Increment(++i): We use ++i in our statement if we want to increment the value of i by 1 and
 then use it in our statement.*/

public class PostPre_Increment {
	 public static void main(String[] args)
	    {
	        // initialize i
	        int i = 0;
	        System.out.println("Post-Increment");
	  
	        // i values is incremented to 1 after returning
	        // current value i.e; 0
	        System.out.println(i++);
	  
	        // initialized to 0
	        int j = 0;
	        System.out.println("Pre-Increment");
	  
	        // j is incremented to 1 and then it's value is
	        // returned
	        System.out.println(++j);
	    }
	}


