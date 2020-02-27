package Example.parameter;

public class PassParameters2 {

	public static void main(String[] args) 
	{
		DynamicCalculator obj1=new DynamicCalculator();
		System.out.println("***************************");
		int sum=obj1.add(10, 20);
		System.out.println("hey new sum "+sum);
		double sub=obj1.sub(33.3, 11.11);
		System.out.println("hey new sum "+sub);
		double mul=obj1.mul(10.23, 2.0);
		System.out.println("hey new sum "+mul);
		String full=DynamicCalculator.getfullname("Pankaj", "kumar").toUpperCase();
		System.out.println("congrats " +full);
	}

}
