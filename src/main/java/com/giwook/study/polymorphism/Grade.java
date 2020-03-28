package com.giwook.study.polymorphism;

/**
 *
 * @author 93Hong on 2020-03-08
 *
 */
public class Grade {
	private String name;
	private int upper, lower;

	public Grade(String name, int upper, int lower) {
		this.name = name;
		this.upper = upper;
		this.lower = lower;
	}

	public boolean isName(String name) {
		return this.name.equals(name);
	}

	public boolean include(int score) {
		return score >= lower && score <= upper;
	}

	public String getName() {
		return name;
	}
}