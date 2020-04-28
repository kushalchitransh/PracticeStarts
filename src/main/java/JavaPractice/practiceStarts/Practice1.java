package JavaPractice.practiceStarts;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		System.out.println("Hello World\n Kushal\n  Enter Your Numbers to be added");
		
		int a,b=0;
		int result=0;	
		Scanner sc= new Scanner(System.in);
		a= sc.nextInt();
		b=sc.nextInt();
		System.out.println( "Number 1 = "+a);
		System.out.println( "Number 2 = "+b);
		result=a+b;
		System.out.println("Sum = "+ result);
sc.close();

	}

}
