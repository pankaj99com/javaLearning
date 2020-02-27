/**
 * 
 */
package String1.demo;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Pankaj.Kumar
 *
 */
public class RemovingDuplicates {

	public static void main(String[] args) {
		String str="Pankaj";
		System.out.println( RemoveDuplicates(str));
	}
	public static String RemoveDuplicates(String str){
		Set<Character> set=new HashSet<>();
		StringBuffer sf=new StringBuffer();
		for(int i=0;i<str.length();i++){
			Character ch=str.charAt(i);
			if(!set.contains(ch)){
				set.add(ch);
				sf.append(ch);
			}
		}
		
return sf.toString();
	}

}
