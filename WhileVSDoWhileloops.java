package java2024;

public class WhileVSDoWhileloops {

	public static void main(String[] args) {
		//Comparison between while and do while loop
	// While loop	
		/*int i=10; // When i =10 it will not print anything in while loop 
		while(i<=5) {
			System.out.println(i); //No output 
			i++;
			
		}*/
		
	//Do while loop
		int i =10; // Whereas in do while loop the statement will be printed once then only it will check for the condition
		do {
			System.out.println(i); //10
			i++;
		}while(i<=5);

	}

}
