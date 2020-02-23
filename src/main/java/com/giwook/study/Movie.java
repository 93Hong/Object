package com.giwook.study;

import com.giwook.study.condition.DiscountCondition;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author 93Hong on 2020-02-22
 *
 */
public abstract class Movie {

	private String title;
	private Duration runningTime;
	private Money fee;
	private List<DiscountCondition> discountConditions;

	public Movie(String title, Duration runningTime, Money fee, DiscountCondition... discountConditions) {
		this.title = title;
		this.runningTime = runningTime;
		this.fee = fee;
		this.discountConditions = Arrays.asList(discountConditions);
	}

	public Money calculateMovieFee(Screening screening) {
		if (isDiscountable(screening)) {
			return fee.minus(calculateDiscountAmount());
		}
		return fee;
	}

	private boolean isDiscountable(Screening screening) {
		return discountConditions.stream()
			.anyMatch(discountCondition -> discountCondition.isSatisfiedBy(screening));
	}

	abstract protected Money calculateDiscountAmount();

	protected Money getFee() {
		return fee;
	}
}
