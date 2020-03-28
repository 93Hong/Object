package com.giwook.study.inheritance.inheritance.policy;

import com.giwook.study.Money;
import com.giwook.study.composition.phone.BasicRatePolicy;
import com.giwook.study.inheritance.inheritance.Call;
import com.giwook.study.inheritance.inheritance.DateTimeInterval;
import com.giwook.study.inheritance.inheritance.DayOfWeekDiscountRule;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 93Hong on 2020-03-28
 *
 */
public class DayOfWeekDiscountPolicy extends BasicRatePolicy {

	private List<DayOfWeekDiscountRule> rules = new ArrayList<>();

	public DayOfWeekDiscountPolicy(List<DayOfWeekDiscountRule> rules) {
		this.rules = rules;
	}

	@Override
	protected Money calculateCallFee(Call call) {
		Money result = Money.ZERO;
		for (DateTimeInterval interval : call.getInterval().splitByDay()) {
			for (DayOfWeekDiscountRule rule : rules) {
				result.plus(rule.calculate(interval));
			}
		}

		return result;
	}
}
