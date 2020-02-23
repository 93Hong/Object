package com.giwook.study.condition;

import com.giwook.study.Screening;

import java.time.DayOfWeek;
import java.time.LocalTime;

/**
 *
 * @author 93Hong on 2020-02-23
 *
 */
public class PeriodCondition implements DiscountCondition {
	private DayOfWeek dayOfWeek;
	private LocalTime startTime;
	private LocalTime endTime;

	private boolean isSatisfiedByPeriod(Screening screening) {
		return dayOfWeek.equals(screening.getWhenScreening().getDayOfWeek()) &&
			startTime.compareTo(screening.getWhenScreening().toLocalTime()) <= 0 &&
			endTime.compareTo(screening.getWhenScreening().toLocalTime()) >= 0;
	}

	@Override
	public boolean isSatisfiedBy(Screening screening) {
		return false;
	}
}
