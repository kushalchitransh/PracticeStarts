package JavaPractice.practiceStarts;

import java.util.Scanner;

public class w3resource_BasicPart1_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=  new Scanner (System.in);
		System.out.println("Enter The Variable A : " );
		double a= s.nextDouble();
		System.out.println("Enter The Variable B : " );
		double b= s.nextDouble();
		Swap1(a,b);


	}

private static  void Swap1(double a, double b) {
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Variable A = "+a+ "\nVariable B = "+b);
		
	}


	}


