package com.giwook.study.typeHierarchy.abstractClass;

import com.giwook.study.Money;
import com.giwook.study.Screening;

/**
 *
 * @author 93Hong on 2020-04-04
 *
 */
public class PercentDiscountAmount extends DiscountPolicy {
	private long percent;
	@Override
	protected Money getDiscountAmount(Screening screening) {
		return screening.getMovieFee().times(percent);
	}
}
