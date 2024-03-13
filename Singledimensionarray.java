/*1.Declare an array
2. add values to the array
3.find the size of an array
4.read single value from an array 
5.read multiple values from an array */


package java2024;

public class Singledimensionarray {

	public static void main(String[] args) {
		
// declaring array and adding values 
		
		// Approach 1 
		
		/*int a[]=new int[5];
		a[0]=100; a[1]=200; a[2]=300; a[3]=400; a[4]=500; */
		
		// Approach 2 
		
	int a[] = {100,200,300,400,500};
		// If there is no value in the array it called as empty array
		//int a[]= {};
		// When we have to go for approach 1 and approach 2 ? 
		// approach 2 seems to be simple written in one line 
		// When you know like how many values we need to assign and in future like we won't change the number of values means we can go for approach 1
		//When you are not sure how many values we will need to assign and in future if we want add any values means we can go for approach 2 
		
		// For approach 2 we don't need new keyword 
		// {100} - index value1
		// {200} - index value 2 and goes on...
		// Automatically it will allocate locations when adding more values and it is dynamic in nature 
		
		// There is a problem with approach 1 we have allocated 5 indexes but having only 3 values for the remaining what will happen ? 
		// the memory will be wasted but in approach 2 that problem is not there and it is the most preferable one 
		
// To find the length of the array - How many values are stored in an array 
		
  //System.out.println("the length of an array"+" "+a.length); // 0
		// Length is an keyword to find the length of the array
		
		// To Read single value of an array 
		
//System.out.println(a[3]); // array index out of bounds exception will be throwing 
		
		// to read all the values in the array 
		// By using the looping statements - For loop is used in array concept - There is another type of for loop - For each loop : it is specifically designed for usage in array 
		
		// By using normal for loop 
		
		/*for(int i=0;i<a.length;i++) // i<=4 , i<5 , i<=a.length-1 , i<a.length 
		{
			System.out.println(a[i]); // 100 , 200, 300,400,500 
		}*/
		
		//Enhanced for loop - Used in arrays and collections
		
		for(int x:a) {
			System.out.println(x);
		}
		
		
	}

		 
		
		
		
		
		
		
		
		
	}


