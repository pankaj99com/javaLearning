package String1.demo;

import java.util.stream.IntStream;

public class StringReverse {
	
	
	public static void main(String[] args) {
		
		String str="This is Good";
		int strlen=str.length();
		for(int l=strlen-1;l>=0;l--){
			
			char strchar=str.charAt(l);
			System.out.print(strchar);
		}
		
		char[] c={'p','a','n','k','a','j'};
		String s1=new String(c);
		int count =s1.length();
		System.out.println();
		System.out.println("count is :" +count);
		System.out.println("Before Reverse:::::::::::");
		for(int i=0;i<s1.length();i++)
		{
			char c1=s1.charAt(i);
			System.out.print(c1);
		}
		System.out.println();
		System.out.println("After reverse:::::::");
		for(int j=count-1;j>=0;j--){
			char c2=s1.charAt(j);
			System.out.print(c2);
			
		}
		
	}
}

