package com.giwook.study.condition;

import com.giwook.study.Screening;

/**
 *
 * @author 93Hong on 2020-02-23
 *
 */
public interface DiscountCondition {
	boolean isSatisfiedBy(Screening screening);
}
