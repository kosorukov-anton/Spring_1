package com.spring.techserv.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

public record BookingRequestDTO(
    @Positive
    long idService,

    @NotNull
    @Future
    LocalDateTime time

){    }
