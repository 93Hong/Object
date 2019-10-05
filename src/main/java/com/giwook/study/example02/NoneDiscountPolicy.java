package com.giwook.study.example02;

/**
 *
 * @author 93Hong on 2019-10-05
 *
 */
public class NoneDiscountPolicy implements DiscountPolicy {

	@Override
	public Money calculateDiscountAmount(Screening screening) {
		return Money.ZERO;
	}
}
