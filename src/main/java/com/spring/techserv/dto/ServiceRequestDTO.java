package com.spring.techserv.dto;


import jakarta.validation.constraints.*;

import java.math.BigDecimal;

public record ServiceRequestDTO(
        @NotBlank //применяется только к строкам и проверяет, что строка не пуста.
        @NotNull //применяется к CharSequence, Collection, Map или Array и проверяет, что объект не равен null. Но при этом он может быть пуст.
        @NotEmpty //применяется к CharSequence, Collection, Map или Array и проверяет, что он не null имеет размер больше 0.
        String title,
        @DecimalMin(value = "1000", inclusive = false, message = "Цена должна быть не меньше 1000.00")
        @Digits(integer = 4, fraction = 0)
        BigDecimal cost) {
}
