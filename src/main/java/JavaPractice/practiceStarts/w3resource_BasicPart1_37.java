/**
 * 
 */
package JavaPractice.practiceStarts;

import java.util.Scanner;

/**
 * @author Kushal Shrivastava
 *37. Write a Java program to reverse a string. Go to the editor
Input Data:
Input a string: The quick brown fox
Expected Output

 xof nworb kciuq ehT
 */
public class w3resource_BasicPart1_37 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("Input a string: " );
		String in=s.nextLine();
		System.out.println("Expected Output1 using StringBuilder : "+reverseString(in));
		char[]c=in.toCharArray();
		reverseString(c);
		System.out.println("Expected Output3 using character Array : "+reverseStringfromChar(in));
		System.out.println("Expected Output4 with Concatination : "+reverseStringfromConcat(in));
		s.close();
	}
public static void reverseString(char[] input)
{

	System.out.print("Expected Output2 : ");
	for(int i=input.length-1;i>=0;i--)
	{
		System.out.print(input[i]);
	}
System.out.println("");
}

public static String reverseString(String s)
{
	StringBuilder sb = new StringBuilder(s);
	sb.reverse();
	return sb.toString();
}

public static String reverseStringfromChar(String s)
{
	String out = null;
	char[] a=s.toCharArray();
	int h=a.length;
	char[] b = new char[h];
	int i,j;
	for(i=0,j=h-1;i<=(h-1);i++,j--)
	{
		b[i]=a[j];
		
	}
	
	return String.valueOf(b);
}

public static String reverseStringfromConcat(String s)
{
	String rev="";
	for(int i=s.length()-1;i>=0;i--)
		rev=rev+s.charAt(i);
	
	return rev;
}

}
