package com.giwook.study.composition.phone;

import com.giwook.study.Money;
import com.giwook.study.inheritance.inheritance.Call;

import java.time.Duration;

/**
 *
 * @author 93Hong on 2020-03-08
 *
 */
public class RegularPolicy extends BasicRatePolicy {

	private Money amount;
	private Duration seconds;

	public RegularPolicy(Money amount, Duration seconds) {
		this.amount = amount;
		this.seconds = seconds;
	}

	@Override
	protected Money calculateCallFee(Call call) {
		return amount.times((int)(call.getDuration().getSeconds() / seconds.getSeconds()));
	}
}
