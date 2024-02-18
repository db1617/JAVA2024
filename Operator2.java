package java2024;

public class Operator2 {

	public static void main(String[] args) {
	// case 1 : 
	//	int a = 10;
		
	//	a=11;
	//	System.out.println(a);
	// a++; //a= a+1;
	// ++ - Value will plus by 1 
	//	System.out.println(a);
// Case 2 : 
		// Post Increment operator 
		//int a =10;
		//int res = a++; 
		//System.out.println(res); // Actual result should be 11 but it will return 10 why it did not get incremented ?
		// At First value is getting stored in the variable then only incrementation is happening so if we print the a value again we will get 11 as result
		// At first assignment is happen then incrementation is happening 
		//System.out.println(a);
		
		// Case 3 : 
		
		// Pre increment operator 
		int a =10;
		int res = ++a; // Here Incrementation is happening 1st then after assignment is happening 
		System.out.println(res);
		
	}

}
