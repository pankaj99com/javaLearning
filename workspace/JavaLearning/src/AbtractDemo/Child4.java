package AbtractDemo;

  public class Child4 extends Child3{

	//method display is already implemented in child class3,so it it not mandatory to redefine the methood in next class
	public void print()
	{
		System.out.println("This is Display:It is mandatory to define all method of abtract class in child class");
	}
	public void Alert()
	{
		System.out.println("This is Alert:It is mandatory to define all method of abtract class in child class");
	}
	public void display1(){
		System.out.println("This is Child class method:Display1");
	}
	public static void main(String[] args) {
		
    Child4 ch=new Child4();
	ch.display();//we can also access the methods of super class i.e child3
	ch.print();
	ch.Alert();
	ch.display1();
	
	
	}

}
