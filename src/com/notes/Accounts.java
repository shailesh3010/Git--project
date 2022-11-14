package com.notes;

public class Accounts {

	private int balance = 5000;

	public int getbalance() {
		return balance;
	}

	public void withdraw(int amount) {
		if (amount > balance) {
			throw new InsufficientFundException("you have low balance");
		}
		balance = balance - amount;
	}

}
