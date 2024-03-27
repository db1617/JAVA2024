
//Searching an element in the array ( linear search )

package JAVA2024new;

public class SearchingelementinArray {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,50,50,70,80}; // eventhough having duplicate values it will find out the 1st value
		int search_element=50;
		boolean status=false;
		
		/*for(int i=0;i<a.length;i++) {
			if(a[i]==element) {
				System.out.println("the element is found");
				temp_value=true;
				break;
			}*/
		for(int x:a)
		{
			if(x==search_element)
			{
				System.out.println("the element is found");
				status=true;
				break;
			}
			
			}
		if(status==false) {
			System.out.println("the element is not found");
		}

	}

}
/*Program explanation:
 * First we are declaring the values in the array 
 * here we are searching for the element 50 
 * we have to search for the element one by one in the array so using the for loop
 * If the 50 is matching with the element the print statement is executed then break statement is executed
 * why break? - because after finding the element we can stop the searching we dont need to search for the element again in the array
 * after that we also need to find out the element which is not present in the array - we are using a temporary variable called as status 
 * 1st we are declaring status as false after finding the right element we are changing it as true
 * if the element not found means status will remain as false and element not found will be displayed 
 * we are putting that if status == false outside the for loop 
 */

