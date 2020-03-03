package demo.pankaj.DynamicPolymorphism;

public class PolyB extends PolyA {
	public void methodA() // Derived Class method
	{
		System.out.println("hello, I'm methodA of class PolyB");
	}

	public static void main(String[] args) {

		PolyA p = new PolyA();
		p.methodA();
		PolyA p1 = new PolyB();
		p1.methodA();

	}

}
