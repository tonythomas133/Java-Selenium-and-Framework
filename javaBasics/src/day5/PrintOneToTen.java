package day5;

public class PrintOneToTen {

	public static void main(String[] args) {
		int i;
		for(i=1; i<11; i++) { //if we use for(;;) it works as n infinite loop
			
			if ((i%2)==0) {
				System.out.println(i+ " is even");
			}
			else  {
				System.out.println(i+ " is odd");
			}
			
		}
		

	}

}
