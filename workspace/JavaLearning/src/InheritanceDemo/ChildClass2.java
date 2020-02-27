package InheritanceDemo;

public class ChildClass2 extends BaseClass{

	public static void main(String[] args) 
	{
		BaseClass obj1=new BaseClass();
		obj1.add();
		obj1.sub();
		//obj1.mul();
		//obj1.div();

	}
	public void mul()
	{
		System.out.println("Hey I am MUL method in Child class");
	}
	public void div()
	{
		System.out.println("Hey I am DIV method in Child class");
	}
}
