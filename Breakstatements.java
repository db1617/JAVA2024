package java2024;

public class Breakstatements {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			
			if(i==5) {
				
				break;
			//	System.out.println(i); // If we write like this it will show unreachable code error because after break statement we should not use any statement after the break statement 	
			}
		System.out.println(i);
		}

	}

}
