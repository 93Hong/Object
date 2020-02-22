package com.giwook.study.example04;

import com.giwook.study.example02.Money;

import java.time.LocalDateTime;

/**
 *
 * @author 93Hong on 2020-02-22
 *
 */
public class Screening {
	private Movie movie;
	private int sequence;
	private LocalDateTime whenScreened;

	public Screening(Movie movie, int sequence, LocalDateTime whenScreened) {
		this.movie = movie;
		this.sequence = sequence;
		this.whenScreened = whenScreened;
	}

	public Money calculateFee(int audienceCount) {
		switch (movie.getMovieType()) {


			case AMOUNT_DISCOUNT:
				if (movie.isDiscountable(whenScreened, sequence)) {
					return movie.calculateAmountDiscountFee().times(audienceCount);
				}
			case PERCENT_DISCOUNT:
				if (movie.isDiscountable(whenScreened, sequence)) {
					return movie.calculatePercentDiscountFee().times(audienceCount);
				}
			case NONE_DISCOUNT:
				return movie.calculateNoneDiscountFee().times(audienceCount);
		}

		return movie.calculateNoneDiscountFee().times(audienceCount);
	}
}
