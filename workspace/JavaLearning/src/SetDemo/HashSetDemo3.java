package SetDemo;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo3 {

	public static void main(String[] args) {
     Set<String> obj1=new HashSet();
	obj1.add("pankaj");
	obj1.add("kumar");
	obj1.add("1");
	obj1.add("bangalore");
	obj1.add("P");

for(String s:obj1)
	
{
	System.out.println(s);
}
	System.out.println("NOTE:::Here Insertion order is not maintained,Also there is no method like (get)to print the values at particular index");

	}

}
