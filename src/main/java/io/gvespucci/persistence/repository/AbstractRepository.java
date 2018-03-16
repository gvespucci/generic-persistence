package io.gvespucci.persistence.repository;

import java.util.Collection;

import io.gvespucci.persistence.specification.Specification;
import io.gvespucci.persistence.strategy.ReadStrategy;
import io.gvespucci.persistence.strategy.WriteStrategy;

public abstract class AbstractRepository<T, Q> implements ReadRepository<T, Q>, WriteRepository<T, Q> {

	private final ReadStrategy<T, Q> readStrategy;
	private final WriteStrategy<T, Q> writeStrategy;

	public AbstractRepository(final ReadStrategy<T, Q> readStrategy, final WriteStrategy<T, Q> writeStrategy) {
		this.readStrategy = readStrategy;
		this.writeStrategy = writeStrategy;
	}

	public Collection<T> findAll() {
		return readStrategy.findAll();
	}

	public Collection<T> findBy(final Specification<Q> specification) {
		return readStrategy.findBy(specification);
	}

	public T findOneBy(final Specification<Q> specification) {
		return readStrategy.findOneBy(specification);
	}

	public Boolean contains(final T object) {
		return readStrategy.contains(object);
	}

	public int deleteBy(final Specification<Q> specification) {
		return writeStrategy.deleteBy(specification);
	}

	public Collection<T> addAll(final Collection<T> objects) {
		return writeStrategy.addAll(objects);
	}

	public T add(final T object) {
		return writeStrategy.add(object);
	}

}
