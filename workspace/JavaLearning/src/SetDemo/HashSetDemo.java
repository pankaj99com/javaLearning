package SetDemo;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
	HashSet<String> obj1=new HashSet();
	obj1.add("pankaj");
	obj1.add("kumar");
	obj1.add("1");
	obj1.add("bangalore");
	obj1.add("P");
	obj1.add("1");
	System.out.println(obj1);
	System.out.println("Here Insertion order is not maintained,Also there is no method like get to print the values at particular index");

	}

}
