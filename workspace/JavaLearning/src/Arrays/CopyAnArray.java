/**
 * 
 */
package Arrays;

/**
 * @author Pankaj.Kumar
 *
 */
public class CopyAnArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] marks={22,23,21,20,19,12,5};
		int[] Copymarks=new int[7];
		//Copymarks=marks;
		//marks[3]=2000;
		
		for(int k=0;k<marks.length;k++){
			Copymarks[k]=marks[k];
		}

		for(int i=0;i<marks.length;i++){
			System.out.println(marks[i]);
		}
		System.out.println("printing values of another array");
		System.out.println("*************************************");
		for(int j=0;j<Copymarks.length;j++){
			System.out.println(Copymarks[j]);
		}
	}

}
