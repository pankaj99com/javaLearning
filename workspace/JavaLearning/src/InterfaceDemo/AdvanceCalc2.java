package InterfaceDemo;

public class AdvanceCalc2 implements Calc{

	public static void main(String[] args) 
	{
		Calc obj1=new AdvanceCalc2();//reference of base class and object of child class
		obj1.add();
		obj1.sub();
         //obj1.div();
		//obj1.mul();
		
	}

	public void mul(){
		System.out.println("I am from AdvanceCalc:Mul method");
		
	}
	public void div(){
		System.out.println("I am from AdvanceCalc:Div method");
		
	}
	public void add() {
		System.out.println("I am from interface:add method");
		
	}

	
	public void sub() {
		System.out.println("I am from interface:sub method");
		
	}

}
