package SetDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
	LinkedHashSet<String> obj1=new LinkedHashSet();
	obj1.add("pankaj");
	obj1.add("kumar");
	obj1.add("1");
	obj1.add("bangalore");
	obj1.add("P");
	System.out.println(obj1);
	System.out.println("Here Insertion order is  maintained,Also there is no method like get to print the values at particular index");

	}

}
