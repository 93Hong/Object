package com.giwook.study.polymorphism;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 93Hong on 2020-03-08
 *
 */
public class Lecture {
	private int pass;
	private String title;
	private List<Integer> scores = new ArrayList<>();

	public Lecture(int pass, String title, List<Integer> scores) {
		this.pass = pass;
		this.title = title;
		this.scores = scores;
	}

	public String stats() {
		return String.format("Title: %s, Evaluation Method:%s", title, getEvaluateMethod());
	}

	protected String getEvaluateMethod() {
		return "Pass or Fail";
	}

	public double average() {
		return scores.stream().mapToInt(Integer::intValue).average().orElse(0);
	}

	public List<Integer> getScores() {
		return scores;
	}

	public String evaluate() {
		return String.format("pass:%d fail:%d", passCount(), failCount());
	}

	private long failCount() {
		return scores.size() - passCount();
	}

	private long passCount() {
		return scores.stream().filter(score -> score >= pass).count();
	}

}
