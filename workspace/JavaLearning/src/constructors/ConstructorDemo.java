package constructors;

public class ConstructorDemo {
	
	    int id;  
	    String name;  
	    //constructor to initialize integer and string  
	    ConstructorDemo(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    //constructor to initialize another object  
	    ConstructorDemo(ConstructorDemo s){  
	    id = s.id;  
	    name =s.name;  
	    }  
	    void display()
	    {
	    	System.out.println(id+" "+name);
	    	
	    }  
	   
	    public static void main(String args[]){  
	    	ConstructorDemo s1 = new ConstructorDemo(111,"Karan");  
	    	ConstructorDemo s2 = new ConstructorDemo(s1);  
	    s1.display();  
	    s2.display();  
	   }  
	}  
