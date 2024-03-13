/*1.Declaring the array
2.assigning the values in the array
3.finding the length of the array
4.reading specific value from the array 
5.reading all the values in the array*/


package java2024;

public class Twodimensionalarray {

	public static void main(String[] args) {
		//Approach 1 
/*int a[][]= new int [3][2];
a[0][0]=100;
a[0][1]=200;
a[1][0]=300;
a[1][1]=400;
a[2][0]=500;
a[2][1]=600;*/
		
		// Approach 2 
		 
		//int a[][]= {};
//int [][]a={}; // brackets can also be written before the variable 
//int []a[]= {}; // can also be written like this
int []a[]= {{100,200},{300,400},{500,600}};
// Finding the size of the array
System.out.println("the length of the rows in the array"+" "+a.length);
System.out.println("the length of columns in the array"+" "+a[0].length);

// Reading one value from the array 

System.out.println("print one value in the array"+" "+a[2][1]);

// Reading all the values in the array

/*for(int r=0;r<=a.length-1;r++) {
	for(int c=0;c<=a[r].length-1;c++)
	{
		System.out.print(a[r][c]+" ");
		
	}
	System.out.println();*/
for(int arr[]:a) { // Why we are using single dimension array in the outer for loop ? 
	//
	for(int x:arr){
		System.out.print(x+" ");
		
	}
	System.out.println();
}

}




}
