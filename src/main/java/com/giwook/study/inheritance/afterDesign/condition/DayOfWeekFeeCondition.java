package com.giwook.study.inheritance.afterDesign.condition;

import com.giwook.study.inheritance.inheritance.Call;
import com.giwook.study.inheritance.inheritance.DateTimeInterval;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author 93Hong on 2020-03-29
 *
 */
public class DayOfWeekFeeCondition implements FeeCondition {

	private List<DayOfWeek> dayOfWeeks = new ArrayList<>();

	public DayOfWeekFeeCondition(DayOfWeek... dayOfWeeks) {
		this.dayOfWeeks = Arrays.asList(dayOfWeeks);
	}

	@Override
	public List<DateTimeInterval> findTimeInterval(Call call) {
		return call.getInterval().splitByDay().stream()
			.filter(each -> dayOfWeeks.contains(each.getFrom().getDayOfWeek()))
			.collect(Collectors.toList());
	}
}
