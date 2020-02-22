package com.giwook.study.example04;

import com.giwook.study.example02.Customer;
import com.giwook.study.example02.Money;

/**
 *
 * @author 93Hong on 2019-10-05
 *
 */
public class Reservation {

	private Customer customer;
	private Screening screening;
	private Money fee;
	private int audienceCount;

	public Reservation(Customer customer, Screening screening, Money fee, int audienceCount) {
		this.customer = customer;
		this.screening = screening;
		this.fee = fee;
		this.audienceCount = audienceCount;
	}
}
