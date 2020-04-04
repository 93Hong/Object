package com.giwook.study.typeHierarchy.interfaceType;

import com.giwook.study.Money;
import com.giwook.study.Screening;

/**
 *
 * @author 93Hong on 2020-04-04
 *
 */
public class AmountDiscountPolicy extends DefaultDiscountPolicy {
	@Override
	protected Money getDiscountedFee(Screening screening) {
		return null;
	}
}
