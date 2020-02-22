package com.giwook.study.example04;

import com.giwook.study.example02.Customer;
import com.giwook.study.example02.Money;

/**
 *
 * @author 93Hong on 2020-02-22
 *
 */
public class ReservationAgency {
	public Reservation reserve(Screening screening, Customer customer, int audienceCount) {
		Money money = screening.calculateFee(audienceCount);
		return new Reservation(customer, screening, money, audienceCount);
	}
}
