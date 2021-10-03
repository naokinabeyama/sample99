package practice14;

public class Acount {
	String accountNumber;
	int balance;

	public Acount(String accountNumber, int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		System.out.println("¥" + this.balance + "(口座番号：" + this.accountNumber + ")");
	}
}
