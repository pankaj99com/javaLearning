/**
 * 
 */
package Arrays;

/**
 * @author Pankaj.Kumar
 *
 */
public class CheckDuplicatesInArray {

	/**
	 * How to write a function that finds duplicate values in an array?
	 */
	public static void main(String[] args) {
		int[] array1={10,2,34,2,24,23,10,1,23};
		for(int i=0;i<array1.length;i++)
		{
			for(int j=i+1;j<array1.length;j++)
			{
				if(array1[i] == array1[j])
				{
					System.out.println("Duplicate elements at position  " +j+ " is  " +array1[i]);
					break;
					
				}
				if (i==j){
					System.out.println(array1[i]);
				}
			}
		}

	}

}
