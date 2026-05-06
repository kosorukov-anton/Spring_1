package com.spring.techserv.repository;

import com.spring.techserv.entity.Booking;
import com.spring.techserv.entity.TechService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.Optional;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    Optional<Booking> findByTime(LocalDateTime time);

}