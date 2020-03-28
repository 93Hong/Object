package com.giwook.study.polymorphism;

import java.util.List;

import static java.util.stream.Collectors.joining;

/**
 *
 * @author 93Hong on 2020-03-08
 *
 */
public class GradeLecture extends Lecture {
	private List<Grade> grades;

	public GradeLecture(int pass, String title, List<Integer> scores, List<Grade> grades) {
		super(pass, title, scores);
		this.grades = grades;
	}

	@Override
	protected String getEvaluateMethod() {
		return "grade";
	}

	@Override
	public String evaluate() {
		return super.evaluate() + ", " + gradeStatistics();
	}

	private String gradeStatistics() {
		return grades.stream()
			.map(this::format)
			.collect(joining(" "));
	}

	private String format(Grade grade) {
		return String.format("%s:%d", grade.getName(), gradeCount(grade));
	}

	private long gradeCount(Grade grade) {
		return getScores().stream().filter(grade::include)
			.count();
	}
}
