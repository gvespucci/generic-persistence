package io.gvespucci.persistence.repository;

import java.util.Collection;

import io.gvespucci.persistence.specification.Specification;

public interface WriteRepository<T, Q> {

    int deleteBy(Specification<Q> specification);
    Collection<T> addAll(Collection<T> objects);
    T add(T object);
	
}
