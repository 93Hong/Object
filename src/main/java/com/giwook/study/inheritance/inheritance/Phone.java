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

	private double taxRate;
	private List<Call> calls = new ArrayList<>();

	public Phone(double taxRate) {
		this.taxRate = taxRate;
	}

	public Money calculateFee() {
		Money result = Money.ZERO;

		for (Call call : calls) {
			result = result.plus(calculateCallFee(call));
		}

		return result.plus(result.times((int)taxRate));
	}

	protected abstract Money calculateCallFee(Call call);
}
