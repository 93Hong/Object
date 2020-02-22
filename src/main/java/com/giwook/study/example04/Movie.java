package com.giwook.study.example04;

import com.giwook.study.example02.Money;
import com.giwook.study.example04.enumumeration.DiscountConditionType;
import com.giwook.study.example04.enumumeration.MovieType;
import lombok.Getter;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author 93Hong on 2020-02-22
 *
 */
public class Movie {
	private String title;
	private Duration runningTime;
	private Money fee;
	private List<DiscountCondition> discountConditions;

	@Getter
	private MovieType movieType;
	private Money discountAmount;
	private double discountPercent;

	public Money calculateAmountDiscountFee() {
		if (movieType != MovieType.AMOUNT_DISCOUNT) {
			throw new IllegalArgumentException();
		}

		return fee.minus(discountAmount);
	}

	public Money calculatePercentDiscountFee() {
		if (movieType != MovieType.PERCENT_DISCOUNT) {
			throw new IllegalArgumentException();
		}

		return fee.minus(fee.times(discountPercent));
	}

	public Money calculateNoneDiscountFee() {
		if (movieType != MovieType.NONE_DISCOUNT) {
			throw new IllegalArgumentException();
		}

		return fee;
	}

	public boolean isDiscountable(LocalDateTime whenScreened, int sequence) {
		for (DiscountCondition discountCondition : discountConditions) {
			if (discountCondition.getType() == DiscountConditionType.PERIOD) {
				if (discountCondition.isDiscountable(whenScreened.getDayOfWeek(), whenScreened.toLocalTime())) {
					return true;
				}
			} else {
				if (discountCondition.isDiscountable(sequence)) {
					return true;
				}
			}
		}

		return false;
	}

}
