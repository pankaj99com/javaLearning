package AbtractDemo;

abstract public class Child3 extends AbstractClassDemo{

	public void display(){
		System.out.println("This is Display:It is mandatory to define all method of abtract class in child class");
	}
	
	public void display1(){
		System.out.println("This is Child class method:Display1");
	}
	
	public abstract void Alert();
	public static void main(String[] args) {
		
    //AbstractClassDemo ch=new Child3();//cannot create object of this class because this becomes abstract class
	//ch.display();
	//ch.print();
	
	
	}

}
