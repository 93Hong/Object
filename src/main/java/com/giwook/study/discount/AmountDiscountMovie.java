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
public class AmountDiscountMovie extends Movie {
	private Money discountAmount;

	public AmountDiscountMovie(String title, Duration runningTime, Money fee, Money discountAmount, DiscountCondition... discountConditions) {
		super(title, runningTime, fee, discountConditions);
		this.discountAmount = discountAmount;
	}

	@Override
	protected Money calculateDiscountAmount() {
		return discountAmount;
	}
}
