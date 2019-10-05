package com.giwook.study.theater;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 *
 * @author 93Hong on 2019-10-05
 *
 */
@Getter @AllArgsConstructor
public class Audience {
	private Bag bag;

	public Long buy(Ticket ticket) {
		return bag.hold(ticket);
	}

}
