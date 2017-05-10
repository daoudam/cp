package com.bnpp.pf.capacity.planning.repository;

import com.bnpp.pf.capacity.planning.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
