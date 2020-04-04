package com.giwook.study.inheritance.afterDesign.condition;

import com.giwook.study.inheritance.inheritance.Call;
import com.giwook.study.inheritance.inheritance.DateTimeInterval;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author 93Hong on 2020-03-29
 *
 */
public class TimeOfDayFeeCondition implements FeeCondition {

	private LocalTime from;
	private LocalTime to;

	public TimeOfDayFeeCondition(LocalTime from, LocalTime to) {
		this.from = from;
		this.to = to;
	}

	@Override
	public List<DateTimeInterval> findTimeInterval(Call call) {
		return call.getInterval().splitByDay().stream()
			.map(each -> DateTimeInterval.of(
				LocalDateTime.of(each.getFrom().toLocalDate(), from(each)),
				LocalDateTime.of(each.getTo().toLocalDate(), to(each))))
			.collect(Collectors.toList());
	}

	private LocalTime to(DateTimeInterval interval) {
		return interval.getTo().toLocalTime().isAfter(to) ?
			to : interval.getTo().toLocalTime();
	}

	private LocalTime from(DateTimeInterval interval) {
		return interval.getFrom().toLocalTime().isBefore(to) ?
			from : interval.getFrom().toLocalTime();
	}


}
