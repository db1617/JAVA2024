package JAVA2024new;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		//Two ways of declaring string variable there is difference between these 2 ways 
		//String s = "Welcome";
		//String s= new String("Welcome");
		
// To find the length of the string : Length()
	//int l=	s.length();
	//System.out.println(l);
	//System.out.println("welcome".length());
//System.out.println(s.length());


// To concat two or more string value : concat()
		//Stored in a variable
/*String s1="Divya";
String s2="Bharathi";
String s3="P";
System.out.println(s1+s2);
System.out.println(s1.concat(s2));
System.out.println(s1+s2+s3);
System.out.println(s1.concat(s2).concat(s3));
System.out.println(s1.concat(s2+s3));*/

// Directly printing the values
/*System.out.println("Divya"+"Bharathi"+"P");
System.out.println("Divya".concat("Bharathi").concat("P"));
System.out.println("Divya".concat("Bharathi"));*/

// To remove extra spaces from right and left side : Trim() 
		
/*String s="   Welcome   ";
System.out.println("before trimming the spaces"+" "+s);
System.out.println(s.length());
System.out.println("After trimming"+" "+s.trim().length());*/

// To return a character from string based on index : charAt() (starts from 0)
		String d1="Divya";
		String d2="Divya";
		String d3="divya";
		System.out.println(d1.charAt(4));
		System.out.println(d1.charAt(1));

		//Contains() - Returns true/ false - This method will check for the string is part of the main string or not
		
		System.out.println(d1.contains("ivy"));//True 
		System.out.println(d1.contains("divya")); // False 
		// It will also check for case sensitivity 
		System.out.println(d1.contains("Divy")); // true 
		System.out.println(d1.contains("iya")); // false 
		// Correct sequence should be followed 
		
		// equals() and equalsIgnorecase() - Compare strings 
		System.out.println(d1==d2); // true
		System.out.println(d1.equals(d2)); // true 
		
		//Both are same but it is having difference we need use both at different places 
		
		System.out.println(d1.equalsIgnoreCase(d3)); // true // This will ignore the case sensitivity in the string
		System.out.println(d1.equalsIgnoreCase("divya")); // true
 
		// replace() - It will replace single or sequence of characters from the string 
		System.out.println(d1.replace("D", "b"));
		d3="welcome to selenium java selenium python selenium C#";
		System.out.println(d3.replace("a", "x"));
		System.out.println(d3.replace("selenium", "cypress"));
		
		// Substring() - extract substring from the main string 
		// straight index : 0
		// ending index : 1 
		
		d3="DivyaBharathi";
		System.out.println(d3.substring(0,8));
		System.out.println(d3.substring(3,9));
		
		//split() - Split the strings to multiple parts based on the delimeter 
		
		d3="test@gmail.com";
	String Sp1[]= d3.split("@");
	System.out.println(Arrays.toString(Sp1));
	System.out.println(Sp1[0]);
	System.out.println(Sp1[1]);
	
//toUppercase() and toLowercase()
	d3="Welcome";
	System.out.println(d3.toUpperCase()); 
	System.out.println(d3.toLowerCase());
	
	
	//EX:1
	
	
	String s1="$21,78,78";
	System.out.println(s1.replace("$",""));
	System.out.println(s1.replace("$", "").replace(",", "")); // 217878
	
	//EX:2'
	
	String s="123,abc@xyz";// 123 abc xyz
	
	String arr1[]= s.split(",");
	System.out.println(Arrays.toString(arr1)); //[123, abc@xyz]
	String arr2[]= arr1[1].split("@");
	System.out.println(Arrays.toString(arr2)); // [abc, xyz]
	System.out.println(arr1[0]+" "+arr2[0]+" "+arr2[1]); //123 abc xyz
	//System.out.println(arr2[0]);
	//System.out.println(arr2[1]);
	
	//EX:3
	
	String s4="123 xyz abc";
	String s5[]=s4.split(" ");
	System.out.println(Arrays.toString(s5)); // [123, xyz, abc]

	//EX:4 
	
	String name= "John Kenedy";
	System.out.println(name.contains("john")); // false 
	System.out.println(name.replace("J", "j").contains("john")); // true
	System.out.println(name.toLowerCase().contains("john"));
	
	
	
	
	}

}
