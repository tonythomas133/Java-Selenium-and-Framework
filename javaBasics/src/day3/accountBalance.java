package day3;
import java.util.Scanner;
public class accountBalance {

	public static void main(String[] args) {
		long account_no;
		int withdrawal , deposit , balance;
		String name;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the account number");
		account_no=s.nextLong();
		System.out.println("Enter the name");
		name=s.next();
		System.out.println("Enter the amount to be withdrawn");
		withdrawal= s.nextInt();
		System.out.println("Enter the total deposit");
		deposit=s.nextInt();
		balance=deposit-withdrawal;
		System.out.println("Account number= " + account_no);
		System.out.println("Name= " + name);
		System.out.println("Deposit= " + deposit);
		System.out.println("Withdrawal= " + withdrawal);
		System.out.println("Current Balance= " + balance);
		

	}

}
