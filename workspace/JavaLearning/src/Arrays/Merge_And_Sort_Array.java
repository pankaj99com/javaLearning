/**
 * 
 */
package Arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author Pankaj.Kumar
 *
 */
public class Merge_And_Sort_Array {

	private static final int[] Null = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int array1[]={2,6,3,1,18};
		int array2[]={4,23,12,34,22,44,54};
		int array3[]=new int[array1.length+array2.length];
		
		int k=0;
		
		for(int i=0;i<array3.length;i++){
			if(i>4){
				array3[i]=array2[k];
				k++;
		
			}
			else{
				array3[i]=array1[i];
			}
			System.out.println("Elements after merge are");
			for(int j=0;j<array3.length;j++){
				System.out.println(array3[j]);
			}
		}
		
		

	}

}
