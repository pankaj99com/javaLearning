package String1.demo;



public class strdemo {
	public static void main(String args[]){
		char[] c={'p','a','n','k','a','j'};
		String s=new String(c);
		System.out.println("before replace");
		for(int i=0;i<s.length();i++){
			char c1=s.charAt(i);
		
		
		System.out.println(c1);
		
		
		}
		if(s.charAt(3)=='k'){
			String c2=s.replace('k','l');
			System.out.println("After replacing charater: "+c2+" ");
		}
		
		}
	}


