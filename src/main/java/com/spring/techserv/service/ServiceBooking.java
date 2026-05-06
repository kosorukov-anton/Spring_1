package com.spring.techserv.service;

import com.spring.techserv.dto.BookingRequestDTO;
import com.spring.techserv.dto.BookingResponseDTO;
import com.spring.techserv.entity.Booking;
import com.spring.techserv.entity.TechService;
import com.spring.techserv.exception.BookingException;
import com.spring.techserv.mapper.BookingMapper;
import com.spring.techserv.repository.BookingRepository;
import com.spring.techserv.repository.ServiceRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
public class ServiceBooking {

    private final BookingRepository bookingRepository;
    private final BookingMapper bookingMapper;
    private final ServiceRepository serviceRepository;

    public Long registerBooking(@Valid BookingRequestDTO bookingRequest) {

        TechService techService = serviceRepository.findById(bookingRequest.idService())
                .orElseThrow(() -> new BookingException(HttpStatus.BAD_REQUEST, "Указанная услуга не существует"));

        Booking booking = bookingMapper.mapToEntity(bookingRequest);
        booking.setTechService(techService);
        booking.setFixedCost(techService.getCost());
        bookingRepository.save(booking);
        return booking.getIdBooking();
    }

    public BookingResponseDTO findByTime(LocalDateTime time) {
        Booking booking = bookingRepository.findByTime(time)
                .orElseThrow(() -> new BookingException(HttpStatus.BAD_REQUEST, "брони с указанной датой нет"));
        bookingMapper.entityToMap(booking);
        return bookingMapper.entityToMap(booking);
    }



}
