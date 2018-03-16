package io.gvespucci.persistence.repository;

public interface Repository<T, Q> extends WriteRepository<T, Q>, ReadRepository<T, Q> {

}
