/*
 * "this" referes to current object
 * "this" is used to identify the instant variables/data members
 * "this" can be used to explicitly invoke the constructor 
 * "this" keyword in the constuctor, that should be the first statmenet of constructor 
 * there cannot be cyclic refereces to "this"
 */
public class Employee {
	int empId;
	String empName;
	
	public Employee() {
		this(101,"John");
		
		System.out.println("Default constructor is invoked");
	}
	
	//overloaded constructor / parameterized constructor 
	public Employee(int empId, String empName) {
		
		System.out.println("Parameterized consturctor is invoked !");
		 this.empId=empId;
		 this.empName=empName;
	 }
	public Employee(int empId) {
		System.out.println("Paratmerized constuctor with one paratmer is invoked ");
	}
	public void displayEmployee() {
		System.out.println(this.empId+" , "+this.empName);
	}
	
	public static void main(String[] args) {
		
		Employee e2 = new Employee(); 
	}

}
