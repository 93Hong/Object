package com.giwook.study.composition.phone;

import com.giwook.study.Money;
import com.giwook.study.inheritance.inheritance.Call;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author 93Hong on 2020-03-08
 *
 */
public class Phone {

	private RatePolicy ratePolicy;
	private List<Call> calls = new ArrayList<>();

	public Phone(RatePolicy ratePolicy) {
		this.ratePolicy = ratePolicy;
	}

	public List<Call> getCalls() {
		return Collections.unmodifiableList(calls);
	}

	public Money calculateFee() {
		return ratePolicy.calculateFee(this);
	}

	public void call(Call call) {

	}
}
