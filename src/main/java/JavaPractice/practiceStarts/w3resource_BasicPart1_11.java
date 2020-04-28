package JavaPractice.practiceStarts;

import java.util.Scanner;

public class w3resource_BasicPart1_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=  new Scanner (System.in);
		System.out.println("Enter The radius of circle : " );
		double r= s.nextDouble();
System.out.println("Area is : "+Area(r));

System.out.println("Perimeter is : "+Perimeter(r));
	}

	public static double Area(double r)
	{
		return (Math.PI * r*r);
	}
	
	public static double Perimeter(double r)
	{
		return (Math.PI * r*2);
	}
		
	}


