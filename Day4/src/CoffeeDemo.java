
public class CoffeeDemo {
	public static void main(String[] args) {
		Coffee coffee=Coffee.NESCAFE;
		System.out.println("You selected "+coffee);
		coffee.prepareCoffee();
		System.out.println("Your bill is :"+coffee.calculateCost());
		
	}
	

}
