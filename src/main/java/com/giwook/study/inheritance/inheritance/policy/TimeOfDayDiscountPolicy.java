package com.giwook.study.inheritance.inheritance.policy;

import com.giwook.study.Money;
import com.giwook.study.composition.phone.BasicRatePolicy;
import com.giwook.study.inheritance.inheritance.Call;
import com.giwook.study.inheritance.inheritance.DateTimeInterval;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 93Hong on 2020-03-28
 *
 */
public class TimeOfDayDiscountPolicy extends BasicRatePolicy {

	private List<LocalTime> starts = new ArrayList<>();
	private List<LocalTime> ends = new ArrayList<>();
	private List<Duration> durations = new ArrayList<>();
	private List<Money> amounts = new ArrayList<>();

	@Override
	protected Money calculateCallFee(Call call) {

		Money result = Money.ZERO;
		for (DateTimeInterval interval : call.splitByDay()) { // number of day
			for (int loop = 0; loop < starts.size(); loop++) { // number of policy
				result.plus(amounts.get(loop).times(
					Duration.between(from(interval, starts.get(loop)), to(interval, ends.get(loop)))
						.getSeconds() / durations.get(loop).getSeconds()
				));
			}
		}

		return result;
	}

	private LocalTime to(DateTimeInterval interval, LocalTime to) {
		return interval.getTo().toLocalTime().isAfter(to) ?
			to : interval.getTo().toLocalTime();
	}

	private LocalTime from(DateTimeInterval interval, LocalTime from) {
		return interval.getFrom().toLocalTime().isBefore(from) ?
			from : interval.getFrom().toLocalTime();
	}
}
