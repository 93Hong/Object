package com.giwook.study.example02;

/**
 *
 * @author 93Hong on 2019-10-05
 *
 */
public interface DiscountPolicy {
	Money calculateDiscountAmount(Screening screening);
}
