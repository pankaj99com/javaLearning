package Arrays;

public class ArraySecondmaximum 
{

	public static void main(String[] args) 
	{
		
		int temp;
		int [] array={10,8,3,22,4,5};
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]<array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
			if(i==1){
				break;
			}
		
		}
		
System.out.println("second maximum number from an array is "+array[1]);
	}

}
