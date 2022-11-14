package com.notes;

public class Test {

	public static void main(String[] args) {
		Accounts obj = new Accounts();
		System.out.println("current balance " + obj.getbalance());
		obj.withdraw(8000);
		System.out.println("remaining balance " + obj.getbalance());
	}

}
