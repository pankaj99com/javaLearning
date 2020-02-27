package Example.parameter;

public class DynamicCalculator {
	public static String getfullname(String firstname,String lastname)
	{
		String completename=firstname+" "+lastname;
		return completename;
	}
	
	public int add(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
	public double sub(double x,double y)
	{
	    double sub=x-y;
		return sub;
	}
	public double mul(double x,double y)
	{
	    double mul=x*y;
		return mul;
	}
}
