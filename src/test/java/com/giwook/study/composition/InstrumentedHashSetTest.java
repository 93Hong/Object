package com.giwook.study.composition;

import org.assertj.core.util.Sets;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

/**
 *
 * @author 93Hong on 2020-03-07
 *
 */
class InstrumentedHashSetTest {

	@Test
	void test() {
		final HashSet<String> stringHashSet = Sets.newHashSet();
		final InstrumentedHashSet<String> instrumentedHashSet = new InstrumentedHashSet<>(stringHashSet);
	}

}