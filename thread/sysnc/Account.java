package thread.sysnc;

public class Account {
	//필드 생성
	private String accId;
	private long balance; // 잔액
	private String ownerName;
	
	//기본생성자
	public Account() {
		
	}
	
	//매개변수가 3개인 생성자
	public Account(String accId, long balance, String ownerName) {
		super();
		this.accId = accId;
		this.balance = balance;
		this.ownerName = ownerName;
	}


	// getter, setter
	public String getAccId() {
		return accId;
	}
	public void setAccId(String accId) {
		this.accId = accId;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public void deposit(long amount) { //입금
		balance += amount;
	}
	
	public void withdraw(long amount) { //출금
		balance -= amount;
	}
	
	
}
