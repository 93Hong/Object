package com.giwook.study.inheritance.inheritance;

import com.giwook.study.Money;

import java.time.Duration;

/**
 *
 * @author 93Hong on 2020-03-08
 *
 */
public class TaxableRegularPhone extends FixedFeePolicy {

	private double taxRate;

	public TaxableRegularPhone(Money amount, Duration seconds, double taxRate) {
		super(amount, seconds);
		this.taxRate = taxRate;
	}

	@Override
	protected Money afterCalculated(Money fee) {
		return fee.plus(fee.times((int)taxRate));
	}
}
