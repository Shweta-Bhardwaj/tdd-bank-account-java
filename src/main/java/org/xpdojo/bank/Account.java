package org.xpdojo.bank;

public class Account {
	private int balance;
	public int balance() {
		return balance;
	}

	public void deposit(Integer amt) {
		if (Integer.signum(amt) >= 0) {
			balance += amt;
		}
	}
}
