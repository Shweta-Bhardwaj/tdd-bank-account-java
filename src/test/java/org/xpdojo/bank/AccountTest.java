package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
	@Disabled
    public void depositAnAmountToIncreaseTheBalance() {
        assertThat("your first test").isBlank();
    }

	@Test
	public Account createAccount(){
		return new Account();
	}
	@Test
	public void depositingMoneyIncreasesBalance() {
		Account account = createAccount();
		account.deposit(100);
		assertEquals(100, account.balance());
	}

	@Test
	public void depositingNegativeAmountDoesNotChangeBalance() {
		Account account = createAccount();
		account.deposit(100);
		account.deposit(-100);
		assertEquals(100, account.balance());
	}

	@Test
	public void depositingInvalidNumberDoesNotChangeBalance() {
		Account account = createAccount();
	//	account.deposit('a'); // Not allowed since deposit takes Integer as parameter.
		assertEquals(0, account.balance());
	}
}
