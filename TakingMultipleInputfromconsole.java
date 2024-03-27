package JAVA2024new;
import java.util.Scanner;

public class TakingMultipleInputfromconsole {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*System.out.println("enter the number1");
		int num1=sc.nextInt();
		System.out.println("enter the number2");
		int num2=sc.nextInt();
		System.out.println("adding num1andnum2"+" "+(num1+num2));*/
		
		System.out.println("enter your name:");
		String name=sc.next();
		System.out.println("name is"+name);
		System.out.println("enter your age");
		int age=sc.nextInt();
		System.out.println("your age is"+" "+age);
		System.out.println("enter any unknown value");
		Object uv=sc.next();
		System.out.println("unknown value is"+" "+uv);
		
		

	}

}
