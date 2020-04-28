/**
 * 
 */
package JavaPractice.practiceStarts;

import java.util.Scanner;

/**
 * @author Kushal Shrivastava
 *38. Write a Java program to count the letters, spaces, numbers and other characters of an input string. Go to the editor
Expected Output

The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
letter: 23                                               
space: 9                                                 
number: 10                                               
other: 6
 */
public class w3resource_BasicPart1_38 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String in;
		Scanner s=new Scanner(System.in);
		System.out.print("The string is :  ");
		in=s.nextLine();
		s.close();
		int letter=0,space =0,number=0,other=0;
		char[]c=in.toCharArray();
		for(int i=0;i<=c.length-1;i++)
		{
			if(Character.isLetter(c[i]))
				letter++;
			else if(Character.isSpaceChar(c[i]))
				space++;
			else if(Character.isDigit(c[i]))
				number++;
			else 
				other++;
		}
	System.out.println("letter : "+letter);
	System.out.println("space  : "+space);
	System.out.println("number : "+number);
	System.out.println("other  : "+other);
	}

}
