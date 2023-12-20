package entities;

public class Account_holder {
	private int numberAccount;
	private String accountHolder;
	private double balance;
	
	//Construtores
	public Account_holder(){
	}
	
	public Account_holder(int numberAccount, String accountHolder) {
		this.accountHolder = accountHolder;
		this.numberAccount = numberAccount;
	}
	
	public Account_holder(int numberAccount, String accountHolder, double initialDeposit) {
		this.numberAccount = numberAccount;
		this.accountHolder = accountHolder;
		deposit(initialDeposit);
	}
	
	//Encapsulamento
	public int getNumberAccount(){
		return numberAccount;
	}
	
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	public String setAccountHolder() {
		return accountHolder;
	}
	
	public void setValue(double value) {
		this.balance = value;
	}
	
	public double getValue() {
		return balance;
	}

	//Metodos
	public String toString() {
		return  "Account: " + numberAccount + " " + "Holder: " + accountHolder + " " + "Balance: $ " + String.format("%.2f", balance);
	}
	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
}
