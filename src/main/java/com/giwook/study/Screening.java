package com.giwook.study;

import lombok.Getter;

import java.time.LocalDateTime;

/**
 *
 * @author 93Hong on 2020-02-22
 *
 */
public class Screening {
	private Movie movie;
	@Getter
	private int sequence;
	@Getter
	private LocalDateTime whenScreening;

	public Reservation reserve(Customer customer, int audienceCount) {
		return new Reservation(customer, this, calculateFee(audienceCount), audienceCount);
	}

	private Money calculateFee(int audienceCount) {

		return movie.calculateMovieFee(this).times(audienceCount);
	}
}