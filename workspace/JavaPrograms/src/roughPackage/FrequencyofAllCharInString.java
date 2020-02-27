package roughPackage;

import java.util.Scanner;

public class FrequencyofAllCharInString {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		char ch,cs;
		int count;
		System.out.println("Enter the string ");
		System.out.println();
		String str=sc.nextLine();
		System.out.println("================");
		System.out.println("length of string "+str.length());

		System.out.println("*****************************");
		
		System.out.println("Char\tFreq");
		System.out.println("*****************************");
		for(cs='a';cs<='z';cs++){
		count=0;
			for(int i=0;i<str.length();i++){
				
				ch =str.charAt(i);
				
				if (ch==cs){
					count++;
					
				}
			}
				if(count!=0){
					
					System.out.println(cs +"\t" + count);
					System.out.println("--------------------|");
				}
					
				}
				
				
				
			}
		}

	


