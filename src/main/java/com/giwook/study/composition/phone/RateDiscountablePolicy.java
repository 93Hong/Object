package com.giwook.study.composition.phone;

import com.giwook.study.Money;

/**
 *
 * @author 93Hong on 2020-03-08
 *
 */
public class RateDiscountablePolicy extends AdditionalRatePolicy {

	private Money discountAmount;

	public RateDiscountablePolicy(RatePolicy next, Money discountAmount) {
		super(next);
		this.discountAmount = discountAmount;
	}

	@Override
	protected Money afterCalculateFee(Money fee) {
		return fee.minus(discountAmount);
	}

}
