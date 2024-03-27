package JAVA2024new;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingandWritingDataintoArray {

	public static void main(String[] args) {
		int a[]=new int[6];
		Scanner sc=new Scanner(System.in);
		
for(int i=0;i<a.length;i++) {
	System.out.println("enter the value for the position"+":"+i);
	a[i]=sc.nextInt();
}
System.out.println("the entered values are:"+" "+Arrays.toString(a));
	}

}
/* Output is : 
 * enter the value for the position:0
100
enter the value for the position:1
200
enter the value for the position:2
300
enter the value for the position:3
400
enter the value for the position:4
500
enter the value for the position:5
600
the entered values are: [100, 200, 300, 400, 500, 600]

 */
