/**
 * 
 */
package Arrays;

/**
 * @author Pankaj.Kumar
 *
 */
public class CommonValuesInTwoArrays {

	/**
	 * Write a Java program to find the common elements between two arrays 
	 */
	public static void main(String[] args) {
		String[] str1={"pankaj","kumar","laxmi","kumari"};
		String[] str2={"Laxman","kumar","rani","kumari"};
		for(int i=0;i<str1.length;i++)
		{
			
			for(int j=0;j<str2.length;j++)
			{
				if(str1[i]==str2[j])
				{
					System.out.println(str2[j]);
					
				}
			}
		}

	}

}
