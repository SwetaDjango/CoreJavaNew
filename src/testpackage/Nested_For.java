package testpackage;

public class Nested_For {

	public static void main(String[] args) {
	//for one outer iteration all inner iterations are done 	
		for (int i = 1; i <= 10; i++) {   //10 times
			for (int j = 1; j <= 5; j++) {  //5 times 
				System.out.println(i + "," + j);
			}
			System.out.println("All Iterations of J are Done");
		}
	}

}
