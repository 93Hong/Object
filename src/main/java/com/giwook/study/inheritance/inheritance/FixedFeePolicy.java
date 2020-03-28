package com.giwook.study.inheritance.inheritance;

import com.giwook.study.Money;

import java.time.Duration;

/**
 *
 * @author 93Hong on 2020-03-07
 *
 */
public class FixedFeePolicy extends Phone {

	private Money amount;
	private Duration seconds;

	public FixedFeePolicy(Money amount, Duration seconds) {
		this.amount = amount;
		this.seconds = seconds;
	}

	@Override
	protected Money calculateCallFee(Call call) {
		return amount.times((int)(call.getDuration().getSeconds() / seconds.getSeconds()));
	}
}
