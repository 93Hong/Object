package com.giwook.study.inheritance.afterDesign.rule;

import com.giwook.study.Money;
import com.giwook.study.inheritance.afterDesign.condition.FeeCondition;
import com.giwook.study.inheritance.inheritance.Call;

/**
 *
 * @author 93Hong on 2020-03-29
 *
 */
public class FeeRule {

	private FeeCondition feeCondition;
	private FeePerDuration feePerDuration;

	public FeeRule(FeeCondition feeCondition, FeePerDuration feePerDuration) {
		this.feeCondition = feeCondition;
		this.feePerDuration = feePerDuration;
	}

	public Money calculateFee(Call call) {
		return feeCondition.findTimeInterval(call).stream()
			.map(each -> feePerDuration.calculate(each))
			.reduce(Money.ZERO, Money::plus);
	}
}
