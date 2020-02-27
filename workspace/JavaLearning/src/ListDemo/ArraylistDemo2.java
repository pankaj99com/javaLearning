package ListDemo;

import java.util.ArrayList;

public class ArraylistDemo2 {

	public static void main(String[] args) {
		ArrayList obj1=new ArrayList();
		obj1.add("p");
		obj1.add(10.2);
		obj1.add("pankaj kumar");
		obj1.add(5);
		obj1.add(10.2);
	int arraysize=obj1.size();
	for(int i=0;i<arraysize;i++)
	{
		System.out.println(obj1.get(i));
	}
		
	}

}
