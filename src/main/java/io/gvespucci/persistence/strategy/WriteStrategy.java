package io.gvespucci.persistence.strategy;

import java.util.Collection;

import io.gvespucci.persistence.specification.Specification;

public interface WriteStrategy<T, Q> {
	
	int deleteBy(Specification<Q> specification);
    Collection<T> addAll(Collection<T> objects);
    T add(T object);

}
