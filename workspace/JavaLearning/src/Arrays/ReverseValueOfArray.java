/**
 * 
 */
package Arrays;

import java.util.Scanner;

/**
 * @author Pankaj.Kumar
 *
 */
public class ReverseValueOfArray {

	/**
	 * How to reverse elements in an array in java?
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Elements");
		int input = sc.nextInt();
		// Now create an array of size given from console
		int[] array1 = new int[input];
		System.out.println("enter the  elements in an array");
		for (int i = 0; i < input; i++) {
			array1[i] = sc.nextInt();
		}
		System.out.println("Printing the elemets in reverse order");
		for (int j = array1.length - 1; j >= 0; j--) {
			System.out.println(array1[j]);
		}
	}

}
