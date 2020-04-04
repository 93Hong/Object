package com.giwook.study.inheritance.afterDesign.condition;

import com.giwook.study.inheritance.inheritance.Call;
import com.giwook.study.inheritance.inheritance.DateTimeInterval;

import java.util.List;

/**
 *
 * @author 93Hong on 2020-03-29
 *
 */
public interface FeeCondition {
	List<DateTimeInterval> findTimeInterval(Call call);
}
