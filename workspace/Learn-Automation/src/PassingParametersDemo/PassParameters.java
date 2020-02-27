package PassingParametersDemo;

public class PassParameters {
	public void add(int x,int y)
	{
		int sum=x+y;
		
		System.out.println("addition is "+sum);
	}
    public void sub(double b,double a){
    	
    double sum1=b-a;
    
    	System.out.println("subtration is "+sum1);
		
	}
	public static void main(String[] args) {
		
		PassParameters obj1=new PassParameters();
		
		obj1.add(5, 50);
		obj1.sub(5.5, 6.5);
		System.out.println();
	}

}
