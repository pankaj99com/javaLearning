package ClassDemo;

public class FirstClassDemo {

	
	int a=90;
	int b=100;
	
	
	public void sum(){
		
		int x=80;
		int y=100;
		int z=(x+y);
		
	System.out.println("Sum of numbers are " +z);
		
	}
	
	public static void main(String[] args) {
		System.out.println("start of program");	
		FirstClassDemo obj1=new FirstClassDemo();
		obj1.sum();
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		System.out.println("end of program");		
		

	}

}
