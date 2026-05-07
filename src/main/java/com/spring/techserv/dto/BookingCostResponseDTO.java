package com.spring.techserv.dto;

import com.spring.techserv.constants.BookingStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record BookingCostResponseDTO(LocalDateTime time, BigDecimal cost) {
}
