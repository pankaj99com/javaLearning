package PassingParametersDemo;

public class PassParameters2 {
	public int add(int x,int y)
	{
		int sum=x+y;
		return sum;
		
	}
    public double sub(double b,double a){
    	
    double sub1=b-a;
    return sub1;
    
    	
		
	}
	public static void main(String[] args) {
		
		PassParameters2 obj1=new PassParameters2();
		
		int Result1=obj1.add(5, 50);
		Double Result2=obj1.sub(5.5, 6.5);
		
		System.out.println("sum is "+Result1);
		System.out.println("sum is "+Result2);
	}

}
