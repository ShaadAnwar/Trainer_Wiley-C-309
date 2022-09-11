/*
 * static variable
 * static method
 * static block 
 * static instantiation/initialization block 
 * static class possible in inner class 
 */
public  class Employee {
	int empId;
	String empName;
	//int empCounter;//instant variable, for each object the initial value for this is 0
	static int empCounter;//class variable, shared across all the objects. default value as 0
	
	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
		System.out.println("Employee created... counter will increase by one !!");
		empCounter++;
	}
	//static instantiation block 
	//static block
	static {
		
		System.out.println(empCounter);
		System.out.println("In the static block ");
		empCounter=100;
	}
	//static method is used to process the static members 
	//this method can be invoked without object, should be invoked with classname
	//static method is not dedicated to any of the object. So you cannot use the keyword of object, or you cannot use any instant variables inside static method
	public static int getEmployeeCounter() {
		
		return empCounter;
		
	}
	
	public static void main(String[] args) {
		System.out.println("In public static void main");
		Employee employee1=new Employee(101,"abc");
		Employee employee2=new Employee(102,"pqr");
		Employee employee3=new Employee(103,"xyz");
		System.out.println("Number of employees : "+Employee.getEmployeeCounter());//classname.methodname()
	}

}
