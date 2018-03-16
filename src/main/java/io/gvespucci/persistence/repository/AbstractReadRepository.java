package io.gvespucci.persistence.repository;

import java.util.Collection;

import io.gvespucci.persistence.specification.Specification;
import io.gvespucci.persistence.strategy.ReadStrategy;

public abstract class AbstractReadRepository<T, Q> implements ReadRepository<T, Q> {
	
	private ReadStrategy<T, Q> strategy;

	public AbstractReadRepository(ReadStrategy<T, Q> strategy) {
		this.strategy = strategy;
	}
	
	public Collection<T> findAll() {
		return strategy.findAll();
	}

	public Collection<T> findBy(Specification<Q> specification) {
		return strategy.findBy(specification);
	}

	public T findOneBy(Specification<Q> specification) {
		return strategy.findOneBy(specification);
	}

	public Boolean contains(T object) {
		return strategy.contains(object);
	}

}
