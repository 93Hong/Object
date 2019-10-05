package com.giwook.study.example02;

/**
 *
 * @author 93Hong on 2019-10-05
 *
 */
public class SequenceCondition implements DiscountCondition {
	private int sequence;

	public SequenceCondition(int sequence) {
		this.sequence = sequence;
	}

	@Override
	public boolean isSatisfiedBy(Screening screening) {
		return screening.isSequence(sequence);
	}
}
