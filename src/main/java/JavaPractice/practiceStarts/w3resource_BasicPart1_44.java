/**
 * 
 */
package JavaPractice.practiceStarts;

import java.util.Scanner;

/**
 * @author Kushal Shrivastava
 *44. Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn. Go to the editor
Sample Output:

Input number: 5                                                        
5 + 55  + 555
 */
public class w3resource_BasicPart1_44 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s= new Scanner(System.in);
		n=s.nextInt();
		int total=0;
		System.out.printf("%d + %d%d  + %d%d%d\n", n, n, n, n, n, n);
		System.out.println(n+""+" + "+n+""+n+""+"  + "+n+""+n+""+n);
	}

}
