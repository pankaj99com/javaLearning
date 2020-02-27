package InterfaceDemo;

public class AdvanceCalc3 implements Calc{

	public static void main(String[] args) 
	{
		//Calc obj1=new Calc();we cannot create object interface
		
		//obj1.div();
		//obj1.mul();
	//	AdvanceCalc3 obj1=new Calc();
		//we cannot create object of interface because interface has all the methods as abstract
	//	x=90;cannot change the final values
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
