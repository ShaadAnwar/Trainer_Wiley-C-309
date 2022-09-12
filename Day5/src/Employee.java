/*
 * Object class: cosmic superclass of all the classes 
 * toString() : String representation of object
 * hashCode() : int representation of object
 * equals()   : used to check the equality of object
 * clone()    : used to make copy/cloning of object
 * finalize() : destructor, invoked when object gets destroyed. used to clean up the resources. 
 */

//Cloneable Interface : Marker interface
/*
 * Marker interfaces are the interfaces which does not have any method in it. It justs marks the object for some functionality approval given for runtime.
 * e.g. Serializable, Cloneable  
 */
public class Employee extends EmployeeTest implements Cloneable{
	private int empId;
	private String empName;
	
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}


	//String representation of object
	public String toString() {
		// TODO Auto-generated method stub
		return this.empId +" , "+this.empName;
	}
	//superclass ref=new subclass();
	//Object obj=new Employee();
	//used to check the equality of object
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Employee e=(Employee)obj;//downcasting 
		if(this.empId==e.empId)
			return true;
		return false;
	}
	
	

	//int representation of object
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	

	
	
}
