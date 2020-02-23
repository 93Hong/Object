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
public class NoneDiscountMovie extends Movie {
	public NoneDiscountMovie(String title, Duration runningTime, Money fee, DiscountCondition... discountConditions) {
		super(title, runningTime, fee, discountConditions);
	}

	@Override
	protected Money calculateDiscountAmount() {
		return Money.ZERO;
	}
}
