package day2;

public class roosterSheet {

	public static void main(String[] args) {
		int rollno;
		int mark1, mark2, mark3, sum;
		float percent;
		String name;
		rollno=1;
		mark1=45;
		mark2=56;
		mark3=70;
		name= "Tony Thomas";
		sum=mark1+mark2+mark3;
		percent= (float)(sum/3);
		System.out.println("roll number= " + rollno);
		System.out.println("name= " + name);
		System.out.println("English= " + mark1);
		System.out.println("Math= " + mark2);
		System.out.println("Science= " + mark3);
		System.out.println("total= " + sum);
		System.out.println("percentage= " + percent +"%");
		

	}

}
