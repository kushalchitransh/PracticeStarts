package JavaPractice.practiceStarts;


public class w3resource_BasicPart1_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Hello \n"+System.getProperty("user.name");
		int a=23;
		int b=78;
		long r=Add(a,b);
		
		System.out.println(s+"\n"+ r);

	}

	public static long Add(long a, long b)
	
	{
		long result= a+b;
		return result;
	}
	
}
