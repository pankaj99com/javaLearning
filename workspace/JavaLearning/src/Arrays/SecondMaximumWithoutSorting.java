package Arrays;

import java.util.Arrays;

public class SecondMaximumWithoutSorting {
	public static void main(String[] args) {
	int [] array={4,2,5,8,11,12,9,23,7,6};


	int Max=array[1];//second index
	int Min=array[0];//first index 
	
	for(int i=0;i<array.length;i++){
		if (Max <array[i])//1<
		{
			Max=array[i];
		}
		if (Min>array[i]){
			Min=array[i];
			
		}
	}
	System.out.println(Max);
	System.out.println(Min);
	}
	}