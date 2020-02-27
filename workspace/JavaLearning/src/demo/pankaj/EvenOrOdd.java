package demo.pankaj;

public class EvenOrOdd
{
    public static void main(String[] args) 
    {
       int sum=0;
       int sum1=0;
        
        int a[] = {2,3,7,9,4,12,76,39,22,11,8,6,1};
        
      
        System.out.print("Odd numbers:");
        System.out.println("");
        for(int i = 0 ; i < a.length ; i++)
        {
            if(a[i] % 2 != 0)
            {
                System.out.print(a[i]+" ");
                sum=sum+a[i];
                
            }
          
        }
        
     
        System.out.println("\nSum of Odd numbers in an array is\n"+sum);
        	
		
        
        System.out.print("Even numbers:");
        System.out.println("");
        for(int i = 0 ; i <  a.length ; i++)
        {
            if(a[i] % 2 == 0)
            {
                System.out.print(a[i]+" ");
                sum1=sum1+a[i];
            }
        }
        System.out.println("\nSum of even numbers in an array is\n"+sum1);
        
        if(sum>sum1)
        {
        	System.out.println("Sum of Odd number is greater");
        	
        }else
        {
        		System.out.println("Sum of Even Number is Greater");
        }
    }
    
}
