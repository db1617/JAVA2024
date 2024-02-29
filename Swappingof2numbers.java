package jAVAprograms2024;

public class Swappingof2numbers {

	public static void main(String[] args) {
		//Way 1:using third variable "t" 
		int a =10; int b =20;
		System.out.println("before swapping the values are"+" "+a+" "+b);
		/*int t=a;//t=10
		a=b;//a=20
		b=t;//t=10
		System.out.println("after swapping the values are"+" "+a+" "+b);*/
		
		//Way 2: Without using third variable using + and - 
	/*	a=a+b;//10+20=30 , a=30
		b=a-b;//10-20=10, b=10
		a=a-b;//30-10=20 , a=20
		
		System.out.println("after swapping the values are"+" "+a+" "+b); */
		
		//Way 3 : using * and / 
		// This can be used only when a and b have non zero values or else it will throw arithmetic exception
		
		 /*a=a*b; // 10x20=200 , a=200
		b=a/b;// 200/20 =10 , b=10
		a=a/b;//200/10 = 20 , a=20
		
		System.out.println("after swapping the values are"+" "+a+" "+b); */
		
		// Way 4 : Using bitwise XOR operator 
		 /*a=a^b; //a=30
		b=a^b;//b=10
		a=a^b;//a=20
		System.out.println("after swapping the values are"+" "+a+" "+b);*/
		
		//Way 5 : Using single statement 
		
		b=a+b-(a=b); // (20) -40 / 40-20/ b= 20
		
		
		System.out.println("after swapping the values are"+" "+a+" "+b);
		
		

	}

}
