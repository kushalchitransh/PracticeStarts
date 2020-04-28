package JavaPractice.practiceStarts;

import java.util.Scanner;

public class w3resource_BasicPart1_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=  new Scanner (System.in);
		System.out.println("Enter The Width : " );
		double w= s.nextDouble();
		System.out.println("Enter The Height : " );
		double h= s.nextDouble();
System.out.println("Area is : "+Area(w,h));

System.out.println("Perimeter is : "+Perimeter(w,h));
	}

	public static double Area(double w,double h)
	{
		return ( w*h);
	}
	
	public static double Perimeter(double w,double h)
	{
		return (2*(w+h));
	}
		
	}


