package java2024;

public class Objectarray {

	public static void main(String[] args) {
		Object x[] = {100,10.5,'A',"welcome",true};
		// To read all the values in the array using for each loop
		/*for(Object a:x) {
			System.out.println(a);
		}*/
		
		// Using for loop 
		for(int i=0;i<=x.length-1;i++) {
			System.out.println(x[i]);
		}
		

	}

}
