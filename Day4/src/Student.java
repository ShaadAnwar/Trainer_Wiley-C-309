//has-a kind : Containment
//Agreegation, composition 
public class Student extends Object{
	int studentRegNo;
	String studentName;
	Date dtOfAdmission;

	

	public Student(int studentRegNo, String studentName, Date dtOfAdmission) {
		super();
		this.studentRegNo = studentRegNo;
		this.studentName = studentName;
		this.dtOfAdmission = dtOfAdmission;
	}

	public void displayStudent() {
		System.out.println(
				this.studentRegNo + " , " + this.studentName + " , Date of admission: " + dtOfAdmission.displayDate());
	}

	public static void main(String[] args) {
		Date date = new Date(9, 9, 2022);
		if (date.checkDate() == true) {
			Student student = new Student(101, "Rakesh", date);
			System.out.print("Student Enrolled ");
			student.displayStudent();
		} else
			System.out.println("Invalid Date Format, Student can not be enrolled ");
	}

}
