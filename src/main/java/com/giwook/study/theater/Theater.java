package com.giwook.study.theater;

import lombok.AllArgsConstructor;

/**
 *
 * @author 93Hong on 2019-10-05
 *
 */
@AllArgsConstructor
public class Theater {
	private TicketSeller ticketSeller;

	public void enter(Audience audience) {
		ticketSeller.sellTo(audience);
	}

}
