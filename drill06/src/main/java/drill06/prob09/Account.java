package drill06.prob09;

public class Account {
    private String name;
    private int balance;

    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("잔액이 부족합니다.");
        } else {
            balance -= amount;
            System.out.println("출금액: " + amount + ", 잔액: " + balance);
        }
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
