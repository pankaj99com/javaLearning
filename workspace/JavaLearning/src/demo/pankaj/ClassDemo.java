package demo.pankaj;

public class ClassDemo {
static String str="Hello Java";//This variable should be static in order to use inside a class
public static void Message(){
	System.out.println("this is one method outside main method");
}
	public static void main(String[] args) {
		String str1="hello Pankaj";
		System.out.println(str1);
		System.out.println(str);
ClassDemo.Message();
	}

}
