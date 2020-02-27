package InheritanceDemo;

public class ChildClass3 extends BaseClass{

	public static void main(String[] args) 
	{
		BaseClass obj1=new ChildClass3();
		obj1.add();
		obj1.sub();
  	//	obj1.div();
  	//	obj1.mul();

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
