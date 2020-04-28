package JavaPractice.practiceStarts;

import java.util.Scanner;

public class w3resource_BasicPart1_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		System.out.print("Average Of Numbers\nEnter the number of elements : ");
		Scanner io = new Scanner(System.in);	
		int n=io.nextInt();
		
		int x=1;
		double sum=0;
		while(x<=n)
		{
			System.out.print("Enter number "+x+" : ");
			double add=io.nextDouble();
			sum =sum+add;
			x++;
		}
		
		//double a=io.nextDouble(),b = io.nextDouble(),c=io.nextDouble();
		
		System.out.println("The AVG is "+Average(sum,n));
	}

	private static double Average(double a, int b) {

	double result=	(a/b);
		return result;
	}

}
