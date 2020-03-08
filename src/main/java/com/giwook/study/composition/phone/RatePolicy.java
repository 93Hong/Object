package com.giwook.study.composition.phone;

import com.giwook.study.Money;

/**
 *
 * @author 93Hong on 2020-03-08
 *
 */
public interface RatePolicy {
	Money calculateFee(Phone phone);
}
