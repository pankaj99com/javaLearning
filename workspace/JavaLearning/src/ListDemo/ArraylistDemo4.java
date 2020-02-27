package ListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistDemo4 {

	public static void main(String[] args) {
		ArrayList<String> obj1=new ArrayList<String>();
		//obj1.add(10);
		obj1.add("pankaj");
		obj1.add("kumar");
		obj1.add("p");
		
		Iterator<String> it=obj1.iterator();
		while(it.hasNext()){
			String val=it.next();
			System.out.println(val);
		}
		
	}

}
