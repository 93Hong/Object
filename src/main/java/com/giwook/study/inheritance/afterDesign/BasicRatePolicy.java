package com.giwook.study.inheritance.afterDesign;

import com.giwook.study.Money;
import com.giwook.study.composition.phone.Phone;
import com.giwook.study.composition.phone.RatePolicy;
import com.giwook.study.inheritance.afterDesign.rule.FeeRule;
import com.giwook.study.inheritance.inheritance.Call;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author 93Hong on 2020-03-29
 *
 */
public class BasicRatePolicy implements RatePolicy {

	private List<FeeRule> feeRules = new ArrayList<>();

	public BasicRatePolicy(FeeRule... feeRules) {
		this.feeRules = Arrays.asList(feeRules);
	}

	@Override
	public Money calculateFee(Phone phone) {
		return phone.getCalls().stream()
			.map(this::calculate)
			.reduce(Money.ZERO, Money::plus);
	}

	private Money calculate(Call call) {
		return feeRules.stream()
			.map(feeRule -> feeRule.calculateFee(call))
			.reduce(Money.ZERO, Money::plus);
	}
}
