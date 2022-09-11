
/*
 * Triangle class contains : base and height 
 * user initites the base, and height is triple of base
 * calcuate the area of triangle
 * getXxx
 * setXxx
 * empId: getEmpId, setEmpId
 * salary: getSalary, setSalary
 * 
 */
public class Triangle {
	private double base,height, area;//tight encapsulation 
	public Triangle(double base) {
		this.base=base;
		this.height=this.base*3;
	}
	public double getBase() {
		return base;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getArea() {
		return area;
	}
	
	public double calculateArea() {
		area=0.5*base*height;
		return area;
	}
	

	

}
