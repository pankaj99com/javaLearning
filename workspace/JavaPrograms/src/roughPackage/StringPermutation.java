package roughPackage;

public class StringPermutation {

	public static void main(String[] args) {
		String str="aab";
		int len=str.length();
		StringPermutation per=new StringPermutation();
		per.permute(str, 0, len-1);
		
		
	}
public String swap(String a, int i, int j)

{
	char temp;
	char[] ch=a.toCharArray();
	temp=ch[i];	
	ch[i]=ch[j];
	ch[j]=temp;
	return String.valueOf(ch);
}



public void permute(String str,int l,int r)
{
	if(l==r)
	
		System.out.println(str);
	else{
	for(int i=l;i<=r;i++)
	{
        str=swap(str, l,i);
		permute(str,l+1,r);	
		str=swap(str,l,i);
	}
}
}
}