package jAVAprograms2024;

import java.util.Scanner;

public class Reversingnumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to reverse:");
		int num= sc.nextInt(); // 1234 
		
		//1.Using algorithm 
		
		/*int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10; //1st- 0*10=0 + 1234%10=4 //2nd- rev=4  4*10=40 + 123%10=3 rev=43 // 3rd - 43*10=430+2 = 432 rev=432 // 4th 432*10=4320 + 1=4321 rev=4321 
		
			num=num/10; // 1st - num=1234/10 = 123 num =123 // 2nd 123/10=12 num=12 // 3rd 12/10=1 num=1 // 4th 1/10 = 0 num=0
			
			
		}
		System.out.println("The number after the reversal:"+" "+rev);*/
		
		//2.Using string buffer class 		
		// In string buffer method we are using rev method without using any logic 
		
		//StringBuffer rev; // Rev variable is of StringBuffer type 
		
		//StringBuffer sb= new StringBuffer(String.valueOf(num));
		
		// To convert the number to the string type we use String.valueof method and that value of the string we can store in sb 
		
		//StringBuffer rev=sb.reverse();
//System.out.println("the number after reversal"+" "+rev);


// 3.Using string builder class - In String builder class also we have reverse method 

StringBuilder sbl= new StringBuilder();
sbl.append(num);
StringBuilder rev= sbl.reverse();
System.out.println("the number after reversal"+" "+rev);
	}

}
