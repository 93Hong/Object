package com.giwook.study.inheritance.inheritance;

import com.giwook.study.Money;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 93Hong on 2020-03-07
 *
 */
public abstract class Phone {

	private List<Call> calls = new ArrayList<>();

	public Money calculateFee() {
		Money result = Money.ZERO;

		for (Call call : calls) {
			result = result.plus(calculateCallFee(call));
		}

		return result;
	}

	protected abstract Money calculateCallFee(Call call);

	protected Money afterCalculated(Money fee) {
		return fee;
	}
}
