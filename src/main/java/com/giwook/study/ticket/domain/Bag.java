package com.giwook.study.ticket.domain;

/**
 *
 * @author 93Hong on 2019-10-05
 *
 */
public class Bag {
	private Long amount;
	private Invitation invitation;
	private Ticket ticket;

	public Bag(Long amount) {
		this(amount, null);
	}

	public Bag(Long amount, Invitation invitation) {
		this.amount = amount;
		this.invitation = invitation;
	}

	public boolean hasTicket() {
		return this.ticket != null;
	}

	public boolean hasInvitation() {
		return this.invitation != null;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public void minusAmount(Long amount) {
		this.amount -= amount;
	}

	public void plusAmount(Long amount) {
		this.amount += amount;
	}

}
