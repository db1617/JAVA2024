package jAVAprograms2024;

public class Practise1 {

	public static void main(String[] args) {
		int a =40; int b=60;
		System.out.println("Before swapping:"+a+" "+b);
		//Way 1 
		/*int t=a; //t=40		
		a=b;//b=60
		b=t;//t=60
		System.out.println("after swapping:"+a+" "+b);*/
		
		//Way2
		/*a=a+b; // a=100
		b=a-b;// b=40
		a=a-b;//a=60
		
		System.out.println("after swapping:"+a+" "+b);*/
		
		//Way3
	/*	a=a*b; //a=2400
		b=a/b; //b=40
		a=a/b;//a=60
		System.out.println("after swapping:"+a+" "+b);*/
//way 4
		/*a=a^b; // a=20
		b=a^b; // b=40
		a=a^b; //a=60
		System.out.println("after swapping:"+a+" "+b);*/
		
		//way5
		b= a+b-(a=b);// (a=b): b=60 , a+b= 60+40=100 , 100-60 =40 , b=40
		System.out.println("after swapping:"+a+" "+b);
		
		
		
		
	}

}
