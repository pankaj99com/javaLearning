package SetDemo;

import java.util.ArrayList;
import java.util.HashSet;

import java.util.Set;

public class ConvertingSettoList {

	public static void main(String[] args) {
		 Set<String> obj1=new HashSet();
		obj1.add("pankaj");
		obj1.add("kumar");
		obj1.add("1");
		obj1.add("bangalore");
		obj1.add("P");
		System.out.println(obj1);
		
		ArrayList<String> al=new ArrayList<String>(obj1);
	String result=al.get(2);
	System.out.println(result);
	
				}

}
