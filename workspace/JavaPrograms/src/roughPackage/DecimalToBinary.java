package roughPackage;

public class DecimalToBinary {

	public static void main(String[] args) {
		int num=25;
		int [] rem=new int[20];
		
		int index=0;
		
		
		while(num>0){
			
			rem[index]=num % 2;//25%2=1
			index++;
			
			num=num/2;
		}
for(int i=index-1;i>=0;i--){
	
	System.out.print(rem[i]);
}
	}

}
