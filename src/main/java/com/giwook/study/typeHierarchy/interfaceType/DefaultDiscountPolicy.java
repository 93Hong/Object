package com.giwook.study.typeHierarchy.interfaceType;

import com.giwook.study.Money;
import com.giwook.study.Screening;
import com.giwook.study.condition.DiscountCondition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author 93Hong on 2020-04-04
 *
 */
public abstract class DefaultDiscountPolicy implements DiscountPolicy {
	private List<DiscountCondition> conditions = new ArrayList<>();

	public DefaultDiscountPolicy(DiscountCondition... conditions) {
		this.conditions = Arrays.asList(conditions);
	}

	@Override
	public Money calculateDiscount(Screening screening) {
		for (DiscountCondition condition : conditions) {
			if (condition.isSatisfiedBy(screening)) {
				return getDiscountedFee(screening);
			}
		}

		return screening.getMovieFee();
	}

	protected abstract Money getDiscountedFee(Screening screening);
}
