package com.giwook.study.ticket.domain;

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
		if (bag.hasInvitation()) {
			bag.setTicket(ticket);
			return 0L;
		} else {
			bag.setTicket(ticket);
			bag.minusAmount(ticket.getFee());
			return ticket.getFee();
		}
	}

}
