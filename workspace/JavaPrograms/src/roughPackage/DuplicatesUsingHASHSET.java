package roughPackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class DuplicatesUsingHASHSET {

	public static void main(String[] args) {
		
		
		
		//String names[]={"java","c","c++","java","qtp","c"};
		String name="pankajkumar";
		
		System.out.print("Original string\t====== "+name);
		System.out.println();
		
		System.out.print(" After removing duplicates  ");
		char[] names=name.toCharArray();
		Set store=new HashSet();
		
		for(char n:names){
			
			if(store.add(n)){
			
				System.out.print(n);
				
			}
		
		}

	}

}
