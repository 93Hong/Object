package com.giwook.study.polymorphism;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 93Hong on 2020-03-08
 *
 */
class LectureTest {

	@Test
	void test_1() {
		final Lecture lecture = new Lecture(70, "object", Arrays.asList(81, 95, 75, 50, 45));
		System.out.println(lecture.evaluate());

		final GradeLecture gradeLecture = new GradeLecture(70, "object", Arrays.asList(81, 95, 75, 50, 45), Arrays.asList(new Grade("A", 100, 90),
			new Grade("B", 89, 80), new Grade("C", 79, 0)));
		System.out.println(gradeLecture.evaluate());
	}

	@Test
	void test_2() {
		System.out.println(new Professor("polymorphism", new Lecture(80, "object", Arrays.asList(81, 95, 75, 50, 45))).compileStatistics());

		System.out.println(new Professor("polymorphism",
			new GradeLecture(70, "object", Arrays.asList(81, 95, 75, 50, 45), Arrays.asList(new Grade("A", 100, 90),
				new Grade("B", 89, 80), new Grade("C", 79, 0)))).compileStatistics());
	}

	@Test
	void test_3() {
		final Lecture lecture = new Lecture(70, "object", Arrays.asList(81, 95, 75, 50, 45));
		System.out.println(lecture.stats());

		final GradeLecture gradeLecture = new GradeLecture(70, "object", Arrays.asList(81, 95, 75, 50, 45), Arrays.asList(new Grade("A", 100, 90),
			new Grade("B", 89, 80), new Grade("C", 79, 0)));
		System.out.println(gradeLecture.stats());
	}

}