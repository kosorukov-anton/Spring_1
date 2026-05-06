package com.spring.techserv.dto;

import com.spring.techserv.constants.BookingStatus;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record BookingResponseDTO(long idBooking, String title, BigDecimal cost, LocalDateTime time, BookingStatus bookingStatus) {
}
