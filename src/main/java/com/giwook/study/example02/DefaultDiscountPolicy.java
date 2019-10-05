package com.giwook.study.example02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author 93Hong on 2019-10-05
 *
 */
public abstract class DefaultDiscountPolicy implements DiscountPolicy {
	private List<DiscountCondition> conditions = new ArrayList<>();

	public DefaultDiscountPolicy(DiscountCondition ... conditions) {
		this.conditions = Arrays.asList(conditions);
	}

	@Override
	public Money calculateDiscountAmount(Screening screening) {
		for (DiscountCondition condition : conditions) {
			if (condition.isSatisfiedBy(screening)) {
				return getDiscountAmount(screening);
			}
		}

		return Money.ZERO;
	}

	protected abstract Money getDiscountAmount(Screening screening);

}
