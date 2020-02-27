package String.demo;

public class StringDemo {

	public static void main(String[] args) {
	String s1="This is Selenium training";
	String s2="pankaj-kumar-ranchi-jharkhand";
	
	boolean result=s1.startsWith("This");
	System.out.println(result);
	boolean result1=s1.endsWith("Training");
	System.out.println(result1);
	boolean result3=s1.isEmpty();
	System.out.println(result3);
	char result4=s1.charAt(2);
	System.out.println(result4);
	String result5=s1.substring(5, 9);
	System.out.println(result5);
	boolean result6=s1.contains(result5);
	System.out.println(result6);
	String[] result7=s2.split("-");
	for(int i=0;i<result7.length;i++)
	{
		System.out.println("results are " + i + " " +result7[i]);
				
	}
	System.out.println(result7);
	
	}

}
