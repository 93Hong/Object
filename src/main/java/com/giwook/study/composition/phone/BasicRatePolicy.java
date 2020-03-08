package com.giwook.study.composition.phone;

import com.giwook.study.Money;
import com.giwook.study.inheritance.inheritance.Call;

/**
 *
 * @author 93Hong on 2020-03-08
 *
 */
public abstract class BasicRatePolicy implements RatePolicy {

	@Override
	public Money calculateFee(Phone phone) {
		Money result = Money.ZERO;

		for (Call call : phone.getCalls()) {
			result.plus(calculateCallFee(call));
		}

		return result;
	}

	protected abstract Money calculateCallFee(Call call);
}
