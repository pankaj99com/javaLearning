package AbtractDemo;

public class Child1 extends AbstractClassDemo{

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
		
	Child1 ch=new Child1();
	ch.display();
	ch.print();
	ch.display1();

	
	}

}
