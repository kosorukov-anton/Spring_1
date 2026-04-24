package com.spring.techserv.dto;

import com.spring.techserv.constants.BookingStatus;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record BookingResponseDTO(int idBooking,int idService, LocalDateTime time, BookingStatus bookingStatus) {
}
