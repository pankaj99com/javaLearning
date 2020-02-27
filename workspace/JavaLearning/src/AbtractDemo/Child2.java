package AbtractDemo;

public class Child2 extends AbstractClassDemo{

	public void display(){
		System.out.println("This is Display:It is mandatory to define method of abtract class in child class");
	}
	public void print(){
		System.out.println("This is Print:It is mandatory to define method of abtract class in child class");
	}
	public void display1(){
		System.out.println("This is Child class method:Display1");
	}
	public static void main(String[] args) {
		
    AbstractClassDemo ch=new Child2();//reference of abstract class and object of child class is valid
	ch.display();
	ch.print();
	//ch.display1();//caanot access child class method since the reference is of abstract class.

	
	}

}
