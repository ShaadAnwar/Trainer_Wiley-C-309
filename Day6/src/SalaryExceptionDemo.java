
public class SalaryExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calculateGrossSalary(5000);
		
		

	}

	private static void calculateGrossSalary(int basicSalary) throws SalaryException  {
		// TODO Auto-generated method stub
		if(basicSalary<8000)
			throw new SalaryException();
	}

}
