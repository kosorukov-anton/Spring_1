package com.spring.techserv.dto;

import jakarta.validation.constraints.*;

import java.time.LocalDateTime;

public record BookingRequestDTO(
    @Positive
    int idService,

    @NotNull
    @Future
    LocalDateTime time

){    }
