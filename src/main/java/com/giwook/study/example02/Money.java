package com.giwook.study.example02;

import java.math.BigDecimal;

/**
 *
 * @author 93Hong on 2019-10-05
 *
 */
public class Money {
	public static final Money ZERO = Money.wons(0);

	public static Money wons(long amount) {
		return new Money(BigDecimal.valueOf(amount));
	}

	private final BigDecimal amount;

	public Money(BigDecimal amount) {
		this.amount = amount;
	}

	public Money plus(Money amount) {
		return new Money(this.amount.add(amount.amount));
	}

	public Money minus(Money amount) {
		return new Money(this.amount.subtract(amount.amount));
	}

	public Money times(double percent) {
		return new Money(this.amount.multiply(BigDecimal.valueOf(percent)));
	}

	public boolean isLessThan(Money other) {
		return amount.compareTo(other.amount) < 0;
	}

	public boolean isGreaterThan(Money other) {
		return amount.compareTo(other.amount) >= 0;
	}


}
