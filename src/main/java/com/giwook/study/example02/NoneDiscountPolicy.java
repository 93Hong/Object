package com.giwook.study.example02;

/**
 *
 * @author 93Hong on 2019-10-05
 *
 */
public class NoneDiscountPolicy extends DiscountPolicy {

	@Override
	protected Money getDiscountAmount(Screening screening) {
		return Money.ZERO;
	}
}
