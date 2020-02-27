package Arrays;

import java.util.Arrays;

public class MissingNumberInArray2 {

	public static void main(String[] args) {
		int [] Array={1,2,3,5,6};
		
		int expected=Array.length+1;
		
		int Total_sum=expected*(expected+1)/2;
		
		int sum=0;
		
		for(int i=0;i<Array.length;i++){
			sum=sum+Array[i];
			
		}
		
		System.out.println("missing no is :"+(Total_sum-sum));
	}
}

		