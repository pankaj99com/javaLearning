package demo.pankaj.ConstructorChaining;

public class Employee {
	 
    // member variables
    int empId;
   
    String employer;
    
    String fName;
    String lName;
    int salary;
    // default constructor
    Employee() 
    {
    	this("pankaj","kumar");
        System.out.println(" Inside default constructor");
        this.employer = "Accolite Software";
        this.fName=fName;
        this.lName=lName;
        this.empId = empId;
        this.salary=salary;
        
    }
 
   
    Employee(String fName,String lName)
    {
            this(11111,"Abhijit","Daund");  
        System.out.println("Employee class: Inside parametrized constructor with 2 argument(String fName,String lName)");
       
    }
 
    
    // parametrized constructor with 3 arguments (int id, String fName,String lName)
    Employee(int id, String fName,String lName) {
     this("accolite",10,"pankaj","k");
    	 
 
        System.out.println("Employee class: Inside parametrized constructor with 3 arguments (int id, String fName,String lName)");
       
    }
    Employee(String employer,int empId, String fName,String lName) {
    	 
        System.out.println("Employee class :Inside parametrized constructor with 4 arguments (String employer,int id, String fName,String lName)");
      
    }
 void setEmployeeDeatils( int empId, String employer, String fName, String lName, int salary){
	 this.empId=empId;
	   
	    this.employer=employer;
	    
	    this.fName=fName;
	 this.lName=lName;
	    this.salary=salary;
 }
    // display() method
    void GetEmployeeInfo() {
        System.out.println("\nEmployee details:  \n\nOrgnaization: " + employer + "\nId: " + empId + "\nFiirst Name: " + fName + "\nLast Naame:"+ lName +"\nSalary: " +salary);
    }
 
    public static void main(String args[]) {
 
        // construct an object for permanent employee
        System.out.println("Creating and displaying employee details\n");
        System.out.println("******************************************************************");
        
        Employee e = new Employee();
        System.out.println("******************************************************************");
        
       
      
    }
}