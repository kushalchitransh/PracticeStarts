/**
 * 
 */
package JavaPractice.practiceStarts;

import java.util.Scanner;

/**
 * @author Kushal Shrivastava
 *34. Write a Java program to compute the area of a hexagon. Go to the editor
Area of a hexagon = (6 * s^2)/(4*tan(π/6))
where s is the length of a side
Input Data:
Input the length of a side of the hexagon: 6
Expected Output

The area of the hexagon is: 93.53074360871938
 */
public class w3resource_BasicPart1_34 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double s;
	Scanner in=new Scanner(System.in);
	System.out.println("Input the length of a side of the hexagon: ");
	s=in.nextDouble();
	in.close();
	System.out.println("The area of the hexagon is: "+ areaOfHexagon((int) s));
	}
	
 public static double areaOfHexagon(int s)
 {
	double area;
	area=(6*(Math.pow(s, 2))/(4*(Math.tan(Math.PI/6)))); 
	return area;
	 
 }
}
