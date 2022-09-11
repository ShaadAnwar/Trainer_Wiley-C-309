//dynamic -method dispatch /polymorphhic reference 
public class AnimalApp {

	public static void displayAnimal(Animal animal) {
		animal.breath();
		animal.eat();
		animal.sleep();
		animal.talk();
		if(animal instanceof Dog) //instanceof operator checkes the type of object 
		((Dog)animal).read();
		
			
	}
	public static void main(String[] args) {
	
		Dog dog=new Dog();
		Cat cat=new Cat();
		System.out.println("Infomration about Dog :");
		displayAnimal(dog);
		System.out.println("Information about Cat :");
		displayAnimal(cat);
		
	}

}
