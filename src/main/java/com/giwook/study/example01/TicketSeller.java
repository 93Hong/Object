package com.giwook.study.example01;

import lombok.AllArgsConstructor;

/**
 *
 * @author 93Hong on 2019-10-05
 *
 */
@AllArgsConstructor
public class TicketSeller {
	private TicketOffice ticketOffice;

	public void sellTo(Audience audience) {
		ticketOffice.sellTicketTo(audience);
	}

}
