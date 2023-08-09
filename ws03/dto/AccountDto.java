package com.itskb.ws03.dto;

public class AccountDto {
	private int accountSeq; 
	private String accoutNumber;
	private int balance;
	private int userSeq;
	
	public AccountDto() {
	}
	
	public AccountDto(int accountSeq, String accoutNumber, int balance, int userSeq) {
		super();
		this.accountSeq = accountSeq;
		this.accoutNumber = accoutNumber;
		this.balance = balance;
		this.userSeq = userSeq;
	}

	public int getAccountSeq() {
		return accountSeq;
	}

	public void setAccountSeq(int accountSeq) {
		this.accountSeq = accountSeq;
	}

	public String getAccoutNumber() {
		return accoutNumber;
	}

	public void setAccoutNumber(String accoutNumber) {
		this.accoutNumber = accoutNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getUserSeq() {
		return userSeq;
	}

	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}

	@Override
	public String toString() {
		return "AccountDto [accountSeq=" + accountSeq + ", accoutNumber=" + accoutNumber + ", balance=" + balance
				+ ", userSeq=" + userSeq + "]";
	}
	
}
