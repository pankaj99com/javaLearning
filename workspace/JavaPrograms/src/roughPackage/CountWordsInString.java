package roughPackage;

import java.util.Scanner;

public class CountWordsInString 
{

public static void main(String[] args) 
	
{
		
Scanner sc=new Scanner(System.in);
String s;
int len,count=0;
char ch;
		
System.out.println("Enter the string");
s= sc.nextLine();
len=s.length();
		
for(int i=0;i<len;i++)
{
ch=s.charAt(i);
if(ch == ' ')
{
count++;
}
}
System.out.print(count+1);
}

}
