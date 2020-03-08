package com.giwook.study.composition.phone;

import com.giwook.study.Money;

/**
 *
 * @author 93Hong on 2020-03-08
 *
 */
public class TaxablePolicy extends AdditionalRatePolicy {

	private double taxRate;

	public TaxablePolicy(RatePolicy next, double taxRate) {
		super(next);
		this.taxRate = taxRate;
	}

	@Override
	protected Money afterCalculateFee(Money fee) {
		return fee.plus(fee.times((int)taxRate));
	}
}
