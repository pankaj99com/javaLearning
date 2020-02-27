package Arrays;

import java.util.Scanner;

public class InputAnArrayfromConsole {

	public static void main(String[] args) {
     int length;
     Scanner input=new Scanner(System.in);
     System.out.println("How many values you want to Enter \n");
     System.out.println("================================\n");
     System.out.println("\n");
     length=input.nextInt();
     String [] Names=new String[length];
     for(int i=0;i<length;i++){
    	 System.out.println("Enter the values for your array  :");
    	 Names[i]=input.next();
     }
		
		
		
		input.close();
		
		System.out.println("Names Entered by You are");
		for(int i=0;i<length;i++){
	    	 System.out.println(Names[i]);
		
		
		

	}
	}
}
