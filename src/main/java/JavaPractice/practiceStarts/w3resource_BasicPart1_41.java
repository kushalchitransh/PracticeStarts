/**
 * 
 */
package JavaPractice.practiceStarts;

import java.util.Scanner;

/**
 * @author Kushal Shrivastava
 *41. Write a Java program to print the ascii value of a given character. Go to the editor
Expected Output

The ASCII value of Z is :90
 */
public class w3resource_BasicPart1_41 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("The String for Ascii is : ");
		Scanner s=new Scanner(System.in);
		String in=s.nextLine();
		s.close();
		char []c=in.toCharArray();
		int a[]=new int[c.length];
		for(int i=0;i<=c.length-1;i++)
		{
			a[i]=c[i];
			System.out.println("The Ascii value of "+c[i]+" is "+a[i]+",");
		}
		// TODO Auto-generated method stub
	}

}
