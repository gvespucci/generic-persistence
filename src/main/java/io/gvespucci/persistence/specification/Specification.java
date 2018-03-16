package io.gvespucci.persistence.specification;

/**
 * See http://martinfowler.com/apsupp/spec.pdf
 * See https://github.com/patrikfr/specification
 * See http://www.citerus.se/post/1165770-specification-pattern-as-a-refactoring-tool
 * @param <T>
 */
public interface Specification<T> {

	Boolean isSatisfiedBy(T another);
    Specification<T> or(Specification<T> specification);
    Specification<T> and(Specification<T> specification);
    Specification<T> not();

}
