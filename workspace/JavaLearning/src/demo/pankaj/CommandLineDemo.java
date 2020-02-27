package demo.pankaj;

public class CommandLineDemo {
String str="Hello Java";
	public static void main(String[] args) {
		
		String str1="Hello PANKAJ";
		System.out.println(str1);
		
			System.out.println("****************************");
			
			car c1=new car();
			car c2=new car();
			c1.model="bmw";
			c1.year=2014;
			c2.model="audi";
			c2.year=2011;
			System.out.println(c1.model);
			System.out.println(c1.year);
			System.out.println(c2.model);
			System.out.println(c2.year);
			System.out.println(c1.getyear());
			System.out.println(c1.getModel());
			System.out.println(c1.getModel());
			}
	}


class car{
	
	static int year;
	String model;
	
	
	public int getyear(){
		return year;
	}
	public String getModel(){
		return model;
	}
}