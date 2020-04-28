package JavaPractice.practiceStarts;

import java.util.Scanner;

public class w3resource_BasicPart1_Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.print("Input first number: ");
		
		//Scanner s=new Scanner(System.in);
		
		int s1=5;
				//s.nextInt();
		
		//System.out.print("Input second number: ");
		
		int s2=5;
				//s.nextInt();
		
		for(int i=s1;i>=0;i--)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		

	}

}
