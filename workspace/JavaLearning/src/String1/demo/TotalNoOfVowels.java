/**
 * 
 */
package String1.demo;

import java.util.Scanner;

/**
 * @author Pankaj.Kumar
 *
 */
public class TotalNoOfVowels {

	/**
	 *How to count number of vowels in a string in java? 
	 */
	public static void main(String[] args) {
		System.out.println("Enter Any string");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str1=str.toLowerCase();
		char [] ch=str1.toCharArray();//covert string into character array
		
		int count=0;//intialize the count to 0(this to count the no. of vowels
		/*for(char c:ch)
		{
			switch(c){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
			}*/
		for(int i=0;i<ch.length;i++){
			switch(ch[i]){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
			}
		}
System.out.println("Number of vowels are: " +count);
	}

}
