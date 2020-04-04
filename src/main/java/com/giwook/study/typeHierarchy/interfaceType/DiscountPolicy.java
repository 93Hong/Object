package com.giwook.study.typeHierarchy.interfaceType;

import com.giwook.study.Money;
import com.giwook.study.Screening;

/**
 *
 * @author 93Hong on 2020-04-04
 *
 */
public interface DiscountPolicy {
	Money calculateDiscount(Screening screening);
}
