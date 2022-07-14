package day2;

public class accountBalance {

	public static void main(String[] args) {
		long account_no;
		int withdrawal , deposit , balance;
		String name;
		account_no=123456566;
		withdrawal= 200;
		deposit=5000;
		balance=deposit-withdrawal;
		name= "Tony Thomas";
		System.out.println("Account number= " + account_no);
		System.out.println("Name= " + name);
		System.out.println("Deposit= " + deposit);
		System.out.println("Withdrawal= " + withdrawal);
		System.out.println("Current Balance= " + balance);
		

	}

}
