package roughPackage;
public class Animal{
	
	
	 public static void main(String args[]){  
	    	Animal a=new Dog();  
	        a.eat();  
	        
	        Dog d=new Dog();
	        d.eat();
	        Animal c=new Animal();
	        c.eat();
	        Dog f=(Dog) new Animal();
	        f.eat();
	    }  
    void eat()
    {
    	System.out.println("animal is eating...");
    	
    }  
   }  
     
   class Dog extends Animal{  
    void eat(){
    	System.out.println("dog is eating...");
    	}  
     
   
   }  