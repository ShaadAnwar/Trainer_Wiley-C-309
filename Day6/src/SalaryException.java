public class SalaryException extends RuntimeException{
	String message;
	SalaryException(){
		message="SalaryException Occured";
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Salary is not according to the norm";
	}

}
