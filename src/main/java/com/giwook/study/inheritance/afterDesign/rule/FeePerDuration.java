package com.giwook.study.inheritance.afterDesign.rule;

import com.giwook.study.Money;
import com.giwook.study.inheritance.inheritance.DateTimeInterval;

import java.time.Duration;

/**
 *
 * @author 93Hong on 2020-03-29
 *
 */
public class FeePerDuration {
	private Money fee;
	private Duration duration;

	public FeePerDuration(Money fee, Duration duration) {
		this.fee = fee;
		this.duration = duration;
	}

	public Money calculate(DateTimeInterval interval) {
		return fee.times(interval.duration().getSeconds() / duration.getSeconds());
	}
}
