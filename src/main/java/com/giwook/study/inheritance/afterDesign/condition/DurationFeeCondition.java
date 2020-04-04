package com.giwook.study.inheritance.afterDesign.condition;

import com.giwook.study.inheritance.inheritance.Call;
import com.giwook.study.inheritance.inheritance.DateTimeInterval;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author 93Hong on 2020-03-29
 *
 */
public class DurationFeeCondition implements FeeCondition {

	private Duration from;
	private Duration to;

	public DurationFeeCondition(Duration from, Duration to) {
		this.from = from;
		this.to = to;
	}

	@Override
	public List<DateTimeInterval> findTimeInterval(Call call) {
		if (call.getInterval().duration().compareTo(from) < 0) {
			return Collections.emptyList();
		}

		return Arrays.asList(DateTimeInterval.of(
			call.getInterval().getFrom().plus(from),
			call.getInterval().duration().compareTo(to) > 0 ?
				call.getInterval().getFrom().plus(to) :
				call.getInterval().getTo()
		));
	}
}
