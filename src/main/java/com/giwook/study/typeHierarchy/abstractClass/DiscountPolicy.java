package com.giwook.study.typeHierarchy.abstractClass;

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
public abstract class DiscountPolicy {
	private List<DiscountCondition> conditions = new ArrayList<>();

	public DiscountPolicy(DiscountCondition... conditions) {
		this.conditions = Arrays.asList(conditions);
	}

	public Money calculateDiscountAmount(Screening screening) {
		for (DiscountCondition condition : conditions) {
			if (condition.isSatisfiedBy(screening)) {
				return getDiscountAmount(screening);
			}
		}
		return null;
	}

	protected abstract Money getDiscountAmount(Screening screening);
}
