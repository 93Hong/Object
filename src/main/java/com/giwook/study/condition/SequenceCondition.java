package com.giwook.study.condition;

import com.giwook.study.Screening;

/**
 *
 * @author 93Hong on 2020-02-23
 *
 */
public class SequenceCondition implements DiscountCondition {
	private int sequence;
	private boolean isSatisfiedBySequence(Screening screening) {
		return sequence == screening.getSequence();
	}

	@Override
	public boolean isSatisfiedBy(Screening screening) {
		return false;
	}
}
