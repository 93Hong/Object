package com.giwook.study.inheritance.inheritance;

import com.giwook.study.Money;

import java.time.Duration;

/**
 *
 * @author 93Hong on 2020-03-08
 *
 */
public class TaxableNightlyDiscountPhone extends NightlyDiscountPhone {

	private double taxRate;

	public TaxableNightlyDiscountPhone(Money nightlyAmount, Money regularAmount, Duration seconds, double taxRate) {
		super(nightlyAmount, regularAmount, seconds);
		this.taxRate = taxRate;
	}

	@Override
	protected Money afterCalculated(Money fee) {
		return fee.plus(fee.times((int)taxRate));
	}
}
