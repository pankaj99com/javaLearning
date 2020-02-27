package InterfaceDemo;

public class AdvanceCalc implements Calc{

	public static void main(String[] args) 
	{
		AdvanceCalc obj1=new AdvanceCalc();//ref of child class and object of child class
		obj1.add();
		obj1.sub();
		obj1.div();
		obj1.mul();
		
	}

	public void mul(){
		
		System.out.println("I am from AdvanceCalc:Mul method");
	}
	public void div(){
		System.out.println("I am from AdvanceCalc:Div method");
		
	}
	public void add() {
		
		
	}

	
	public void sub() {
		
		
	}

}
