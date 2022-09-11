
public class TriangleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle triangle=new Triangle(10);
		
		System.out.println("Base of Triangle :"+triangle.getBase());
		System.out.println("Height of Triangle :"+triangle.getHeight());
		double area=triangle.calculateArea();
		System.out.println("Area ="+area);
	}

}
