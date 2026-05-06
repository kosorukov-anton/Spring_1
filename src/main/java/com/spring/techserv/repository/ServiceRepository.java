package com.spring.techserv.repository;

import com.spring.techserv.entity.TechService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ServiceRepository extends JpaRepository<TechService, Long> {

    Optional<TechService> findById(Long id);

}
