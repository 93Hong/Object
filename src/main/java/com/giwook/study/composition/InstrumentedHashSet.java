package com.giwook.study.composition;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author 93Hong on 2020-03-07
 *
 */
public class InstrumentedHashSet<E> implements Set<E> {
	private int addCount = 0;
	private Set<E> set;

	public InstrumentedHashSet(Set<E> set) {
		this.set = set;
	}

	@Override
	public int size() {
		return 0;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public boolean contains(Object o) {
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		return null;
	}

	@Override
	public Object[] toArray() {
		return new Object[0];
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return null;
	}

	public boolean add(E e) {
		addCount++;
		return set.add(e);
	}

	@Override
	public boolean remove(Object o) {
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return false;
	}

	public boolean addAll(Collection<? extends E> c) {
		addCount += c.size();
		return set.addAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return false;
	}

	@Override
	public void clear() {

	}

	public int getAddCount() {
		return addCount;
	}
}
