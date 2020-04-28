/**
 * 
 */
package JavaPractice.practiceStarts;

import java.util.Scanner;

/**
 * @author Kushal Shrivastava
 *32. Write a Java program to compare two numbers. Go to the editor
Input Data:
Input first integer: 25
Input second integer: 39
Expected Output

25 != 39                                                                          
25 < 39                                                                           
25 <= 39

https://www.w3resource.com/java-exercises/basic/java-basic-exercise-32.php
 */
public class w3resource_BasicPart1_32 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b;
		
		Scanner s= new Scanner(System.in);
		System.out.println("Input first integer: ");
		a=s.nextInt();
		
		System.out.println("Input second integer: ");
		b=s.nextInt();
		
		if(a!=b)
		{
			System.out.println(a+"!="+b);
		}
		if(a<b)
		{
			System.out.println(a+"<"+b);

		}
		if(a<=b)
		{
			System.out.println(a+"<="+b);
		}
		if(a==b)
		{
			System.out.println(a+"=="+b);

		}
	}

}
