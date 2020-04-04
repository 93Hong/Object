package com.giwook.study.typeHierarchy.abstractClass;

import com.giwook.study.Money;
import com.giwook.study.Screening;

/**
 *
 * @author 93Hong on 2020-04-04
 *
 */
public class AmountDiscountPolicy extends DiscountPolicy {
	private Money discountAmount;

	@Override
	protected Money getDiscountAmount(Screening screening) {
		return discountAmount;
	}
}
