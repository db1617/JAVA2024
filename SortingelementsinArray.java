//Sorting the elements in the array

package JAVA2024new;

import java.util.Arrays;

public class SortingelementsinArray {

	public static void main(String[] args) {
		int a[]= {100,800,900,300,600,200};
		System.out.println("Before sorting the array...");
		/*for(int value:a) {
			System.out.println(value);
		}*/
System.out.println(Arrays.toString(a));
		// In the arrays class there is a method called as to String this will display all the elements in the array without using for loop
		Arrays.sort(a); // This method will not allow to print the elements in the descending order it allows only ascending order
		//This Sort method will sort the array and inside the bracket is the variable
		
		System.out.println("After sorting the array...");
		System.out.println(Arrays.toString(a));

	}

}
/* Output : It will be like this in the below format it will display in same line 
 * Before sorting the array...
[100, 800, 900, 300, 600, 200]
After sorting the array...
[100, 200, 300, 600, 800, 900]
 */ 
