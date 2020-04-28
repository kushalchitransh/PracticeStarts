/**
 * 
 */
package JavaPractice.practiceStarts;

import java.util.Scanner;

/**
 * @author Kushal Shrivastava
 *33. Write a Java program and compute the sum of the digits of an integer. Go to the editor
Input Data:
Input an integer: 25
Expected Output

The sum of the digits is: 7
 */
public class w3resource_BasicPart1_33 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n;
		System.out.println("Input ab integer: ");
		Scanner s=new Scanner(System.in);
		n=s.nextDouble();
		s.close();
		System.out.println("The sum of the digits is: "+sumofInteger(n));
		}
 
	 static long sumofInteger(double l)
	{
		long sum=0;
		while (l!=0)
		{
			sum+=(l%10);
			l=l/10;
		}
		
		return sum;
		
	}
}
