package Arrays;

import java.util.Arrays;

public class SecondMaximum {
	public static void main(String[] args) {

		int[] array = { 1, 3, 9, 5, 2, 4, 11 };
		int temp;

		System.out.println(array.length);
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 1; j < (array.length - i - 1); j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j + 1];

					array[j + 1] = array[j];

					array[j] = temp;
				}
			}
		}
		System.out.println("Sorted Array is ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("Maximum value in an array is " + array[array.length - 1]);
		System.out.println("Second Maximum value in any array is " + array[array.length - 2]);
	}
}