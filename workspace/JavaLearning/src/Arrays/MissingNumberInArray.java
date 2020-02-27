package Arrays;

import java.util.Arrays;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int [] Array={1,2,3,5,6};
		int MissingNumber=getMissingNumber(Array,6);
		System.out.println("Missing number is "+MissingNumber);
	}

	private static int getMissingNumber(int [] Array,int n){
		
		int actualNumber=0;
		int ExpectedNumber=(n*(n+1)/2);
		
		for(int i=0;i<Array.length;i++){
			
			actualNumber=actualNumber+i;
		}
		
		
		return ExpectedNumber-actualNumber;
	}
}
