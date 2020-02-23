package com.giwook.study.discount;

import com.giwook.study.Money;
import com.giwook.study.Movie;
import com.giwook.study.condition.DiscountCondition;

import java.time.Duration;

/**
 *
 * @author 93Hong on 2020-02-23
 *
 */
public class PercentDiscountMovie extends Movie {
	private double discountPercent;

	public PercentDiscountMovie(String title, Duration runningTime, Money fee, double discountPercent, DiscountCondition... discountConditions) {
		super(title, runningTime, fee, discountConditions);
		this.discountPercent = discountPercent;
	}

	@Override
	protected Money calculateDiscountAmount() {
		return getFee().times((int)discountPercent);
	}
}
