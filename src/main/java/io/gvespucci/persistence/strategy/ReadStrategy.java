package io.gvespucci.persistence.strategy;

import java.util.Collection;

import io.gvespucci.persistence.specification.Specification;

public interface ReadStrategy<T, Q> {
	
	Collection<T> findAll();
    Collection<T> findBy(final Specification<Q> specification);
	T findOneBy(final Specification<Q> specification);
	Boolean contains(final T object);

}
