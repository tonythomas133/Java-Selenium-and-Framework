package day6;

abstract class MyClass { //used to hide the implimentation or business logic from the user
	abstract void print(); //in abstrsact class, initialisation is only done
}
public class AbstractMethod extends MyClass{ 
//implementation
	@Override   //method overiding run time polymorphism. overloading is compile time polymorphism
	void print() {
		System.out.println("implement abstract method");
	}
	public static void main(String[] args) {
		MyClass obj= new AbstractMethod();
		obj.print();
	}

}
