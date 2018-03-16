package io.gvespucci.persistence.strategy;

public interface RepositoryStrategy<T, Q> extends WriteStrategy<T, Q>, ReadStrategy<T, Q> {

}
