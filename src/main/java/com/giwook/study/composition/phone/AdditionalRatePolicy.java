package com.giwook.study.composition.phone;

import com.giwook.study.Money;

/**
 *
 * @author 93Hong on 2020-03-08
 *
 */
public abstract class AdditionalRatePolicy implements RatePolicy {

	private RatePolicy next;

	public AdditionalRatePolicy(RatePolicy next) {
		this.next = next;
	}

	@Override
	public Money calculateFee(Phone phone) {
		Money fee = next.calculateFee(phone);
		return afterCalculateFee(fee);
	}

	protected abstract Money afterCalculateFee(Money fee);
}
