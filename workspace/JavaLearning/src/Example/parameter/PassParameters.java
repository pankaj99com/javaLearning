package Example.parameter;

public class PassParameters {

	public static void main(String[] args) 
	{
		PassParameters obj1=new PassParameters();
		obj1.add(10, 20);
		obj1.sub(20.2, 10.2);
	}
public void add(int a,int b)
{
	int sum=a+b;
	System.out.println("hey Sum is "+sum);
}
public void sub(double x,double y)
{
    double sub=x-y;
	System.out.println("hey sub is "+sub);
}
}
