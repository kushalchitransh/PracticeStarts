/**
 * 
 */
package JavaPractice.practiceStarts;

import java.util.Scanner;

/**
 * @author Kushal Shrivastava
 *35. Write a Java program to compute the area of a polygon. Go to the editor
Area of a polygon = (n*s^2)/(4*tan(π/n))
where n is n-sided polygon and s is the length of a side
Input Data:
Input the number of sides on the polygon: 7
Input the length of one of the sides: 6
Expected Output

The area is: 130.82084798405722

https://www.w3resource.com/java-exercises/basic/index.php
 */
public class w3resource_BasicPart1_35 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfSides, side;
		System.out.println("Input the number of sides on the polygon: ");
		Scanner s=new Scanner(System.in);
		numberOfSides=s.nextInt();
		System.out.println("Input the length of one of the sides: ");
		side=s.nextInt();
		s.close();
		System.out.println("The area is: "+areaOfPolygon(numberOfSides, side));

	}
	public static double areaOfPolygon(int numberOfSides,int side)
	{
		return (numberOfSides*(Math.pow(side, 2))/(4*(Math.tan(Math.PI/numberOfSides))));
	}

}
