package String1.demo;

public class RemovingDuplicatesMethod2 {

	public static void main(String[] args) {
		String str="Pankaj";
		char[] ch=str.toCharArray();
		int length=str.length();
		
		for(int i=0;i<length;i++){
			for(int j=i+1;j<length;j++){
				if(ch[i] ==ch[j]){
					int temp = j;//set duplicate element index
					 System.out.println(temp);
                    //delete the duplicate element by shifting the elements to left
                    for (int k = temp; k < length- 1; k++) {
                    	ch[k] = ch[k + 1];
                    	System.out.println(ch[k]);
                    	System.out.println(ch[k+1]);
                    }
                    j--;
                   System.out.println(j);
                  length--;//reduce char array length
System.out.println("modified length :"+length);
 String str1 = new String(ch);
	str1= str1.substring(0, length);
	System.out.println("String after duplicates removed : " + str1);
				}
				
			}
			
			
		}

	}

}
