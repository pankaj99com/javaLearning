package demo.pankaj;
class triangle
{
	 
    public static void main(String args[])
    {
        
        
    double l1 =3;
    double l2=4;
    double l3 =5;
     
    if ((l1 + l2) > l3)
    {
        if((l1 + l3) > l2)
        {
            if(l2 + l3 > l1)
            {
                System.out.println("\nThe Triangle is a Valid Triangle\n\n");
            }
            else
            {
                System.out.println("\nThe Triangle is Not a Valid Triangle\n\n");
            }
        }
        else
        {
            System.out.println("\nThe Triangle is Not a Valid Triangle\n\n");
        }
    }
    else
    {
        System.out.println("\nThe Triangle is Not a Valid Triangle\n\n");
    }
    
 
    
	if(l1>l2&&l1>l3)
    {
        if((l1*l1)==((l2*l2)+(l3*l3)))
        System.out.println("It is a right-angled triangle");
        else 
        System.out.println("It is not a right-angled triangle");
       }
       if(l2>l3&&l2>l1)
       {
           if((l2*l2)==((l3*l3)+(l1*l1)))
           System.out.println("It is a right-angled triangle");
           else
           System.out.println("It is not a right-angled triangle");
       }
       if(l3>l1&&l3>l2)
       {
           if((l3*l3)==((l1*l1)+(l2*l2)))
           System.out.println("It is a right-angled triangle");
           else
           System.out.println("It is not a right-angled triangle");
       }
   }

    }
    
    
    
    

    
