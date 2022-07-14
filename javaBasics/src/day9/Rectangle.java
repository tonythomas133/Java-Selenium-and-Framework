package day9;

interface Area {  //100% abstraction is possible with interface. In interface there is only abstract methods while abstract keyword can have abstract methods as well as non abstract method
	void getArea(int l, int b);
}
public class Rectangle implements Area{

	public static void main(String[] args) {
		Rectangle r= new Rectangle();
		r.getArea(10,22);

	}

	@Override
	public void getArea(int l, int b) { //methods mentioned in the interface is implemented in the class
		System.out.println("Area is :" + l*b );
		
	}

}


