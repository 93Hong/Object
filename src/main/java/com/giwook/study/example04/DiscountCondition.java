package com.giwook.study.example04;

import com.giwook.study.example04.enumumeration.DiscountConditionType;
import lombok.Getter;

import java.time.DayOfWeek;
import java.time.LocalTime;

/**
 *
 * @author 93Hong on 2020-02-22
 *
 */
public class DiscountCondition {
	@Getter
	private DiscountConditionType type;
	private int sequence;
	private DayOfWeek dayOfWeek;
	private LocalTime startTime;
	private LocalTime endTime;

	public boolean isDiscountable(DayOfWeek dayOfWeek, LocalTime time) {
		if (type != DiscountConditionType.PERIOD) {
			throw new IllegalArgumentException();
		}

		return this.dayOfWeek.equals(dayOfWeek) &&
			this.startTime.compareTo(time) <= 0 &&
			this.endTime.compareTo(time) >= 0;
	}

	public boolean isDiscountable(int sequence) {
		if (type != DiscountConditionType.SEQUENCE) {
			throw new IllegalArgumentException();
		}

		return this.sequence == sequence;
	}

}
