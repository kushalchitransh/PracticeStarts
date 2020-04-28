package JavaPractice.practiceStarts;


public class w3resource_BasicPart1_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Hello \n"+System.getProperty("user.name");
		int a=22;
		int b=10;
		long r=Divide(a,b);
		
		System.out.println(s+"\n"+ r);

	}

	public static long Divide(long a, long b)
	
	{
		long result= a/b;
		return result;
	}
	
}
