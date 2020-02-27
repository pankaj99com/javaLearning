/**
 * 
 */
package Arrays;

/**
 * @author Pankaj.Kumar
 *
 */
public class CheckValuesInArray {


	public static void main(String[] args) {
		String[] array1={"pankaj","kumar","laxmi","kumari"};
		int length=array1.length;
		for(int i=0;i<=length-1;i++)
		{
			String a=array1[i];
			System.out.println(a);	
		}
		for(int j=0;j<=length-1;j++){
			if(array1[j].equals("pankaj")){
				System.out.println("Element "+array1[j]  +  "  Exists");
			break;
			}
			else{
				System.out.println("Element doesn't exists");
				break;
			}
			
		}
		
	}

}
