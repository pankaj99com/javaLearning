package Arrays;

import java.util.Arrays;

public class SecondMaximumWithoutSorting2 {

	public static void main(String[] args) {
		int[] a={2,4,6,12,34,14,23,27};
		int Max=a[0];
		int Max_second=a[0];
		for(int i=1;i<a.length;i++){
			if(Max<a[i]){
				 Max_second=Max;
				 Max=a[i];
				 
				
			}else if (Max_second<a[i]){
				
				Max_second=a[i];
			}
		}
System.out.println("Second max value  " + Max_second);
System.out.println("First  max value  " + Max);
	}
	}