package com.spring.techserv.mapper;

import com.spring.techserv.constants.BookingStatus;
import com.spring.techserv.dto.BookingRequestDTO;
import com.spring.techserv.dto.BookingResponseDTO;
import com.spring.techserv.entity.Booking;
import org.springframework.stereotype.Service;

@Service
public class BookingMapper {
    public static Booking mapToEntity(BookingRequestDTO bookingRequest) {
        return Booking.builder()
                .time(bookingRequest.time())
                .bookingStatus(BookingStatus.ACTIVE)
                .build();
    }

    public BookingResponseDTO entityToMap(Booking booking) {
        return new BookingResponseDTO(
                booking.getIdBooking(),
                booking.getTechService().getTitle(),
                booking.getFixedCost(),
                booking.getTime(),
                booking.getBookingStatus()
        );
    }

}
