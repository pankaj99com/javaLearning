package demo.pankaj;

class PrimeNumber{  
 public static void main(String args[]){  
  int i,m=0,flag=0;     
  int n=9; 
  m=n/2;//checking middle value
  for( i=2;i<=m;i++){    
   if(n%i==0){    
   System.out.println("Number is not prime"); 
  flag=1;
  break;
   }
  }
  if(flag==0)
	   System.out.println("Number is prime");
	 
   }   
     
}
   
 