package ListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistDemo5 {

	public static void main(String[] args) {
		ArrayList obj1=new ArrayList();
		obj1.add("p");
		obj1.add(10.2);
		obj1.add("pankaj kum");
		obj1.add(5);
		Iterator it=obj1.listIterator();
		while(it.hasNext())
			{
			Object val=it.next();
			
			System.out.println(val);
			}
			
		
	}

}
