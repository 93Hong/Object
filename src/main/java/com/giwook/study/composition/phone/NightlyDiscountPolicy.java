package com.giwook.study.composition.phone;

import com.giwook.study.Money;
import com.giwook.study.inheritance.inheritance.Call;

import java.time.Duration;

/**
 *
 * @author 93Hong on 2020-03-08
 *
 */
public class NightlyDiscountPolicy extends BasicRatePolicy {
	private static final int LATE_NIGHT_HOUR = 22;

	private Money regularAmount;
	private Money nightlyAmount;
	private Duration seconds;

	public NightlyDiscountPolicy(Money nightlyAmount, Money regularAmount, Duration seconds) {
		this.regularAmount = regularAmount;
		this.nightlyAmount = nightlyAmount;
		this.seconds = seconds;
	}

	@Override
	protected Money calculateCallFee(Call call) {
		if (call.getFrom().getHour() >= LATE_NIGHT_HOUR) {
			return nightlyAmount.times((int)(call.getDuration().getSeconds() / seconds.getSeconds()));
		} else {
			return regularAmount.times((int)(call.getDuration().getSeconds() / seconds.getSeconds()));
		}
	}
}
