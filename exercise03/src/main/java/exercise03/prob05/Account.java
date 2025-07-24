package exercise03.prob05;

public class Account {
	private String accountNo;
	private int balance;
	
	public Account(String accNo) {
		accountNo = accNo;
		System.out.println(accountNo + " 계좌가 개설 되었습니다.");
	}

	public int getBalance() {
		return balance;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void save(int amount) {
		balance += amount;
		System.out.println(accountNo + " 계좌에 " + amount + "만원이 입금 되었습니다.");
	}

	public void deposit(int amount) {
		if(balance > amount) {
		balance -= amount;
		System.out.println(accountNo + " 계좌에 " + amount + "만원이 출금 되었습니다.");
		}
	}
	
	
}
