package com.giwook.study.example02;

/**
 *
 * @author 93Hong on 2019-10-05
 *
 */
public class PercentDiscountPolicy extends DefaultDiscountPolicy {
	private double percent;

	public PercentDiscountPolicy(double percent, DiscountCondition... conditions) {
		super(conditions);
		this.percent = percent;
	}

	@Override
	protected Money getDiscountAmount(Screening screening) {
		return screening.getMovieFee().times(percent);
	}
}
