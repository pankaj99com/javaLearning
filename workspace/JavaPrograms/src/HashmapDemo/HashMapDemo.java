package HashmapDemo;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap m=new HashMap();
		m.put(1, "pankaj");
		m.put(2, "anand");
		m.put(3, "Laxmi");
		m.put(4, "Kuldeep");
		m.put(1, "pankaj");
		System.out.println(m);
		
		
		System.out.print(m.keySet());
	}

}
