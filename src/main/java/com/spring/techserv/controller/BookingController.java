package com.spring.techserv.controller;

import com.spring.techserv.constants.BookingStatus;
import com.spring.techserv.dto.BookingRequestDTO;
import com.spring.techserv.dto.BookingResponseDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Positive;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Validated
@RequestMapping("/api/v1/booking")
@RestController
public class BookingController {
    //Создание брони
    //{"idService": 1, "time" : "2027-01-19T15:10:06.780"}
    @PostMapping
    public Long createBooking(@Valid @RequestBody BookingRequestDTO bookingRequest){
        return 0L;
    }
    //Получение списка броней
    @GetMapping
    public List<BookingResponseDTO> getAllBooking(){
        return null;
    }
    //Отмена брони
    @PutMapping("/cancel/{id}")
    public Long editService(
            @Positive
            @PathVariable
                    ("id") int idBooking){
        return 0L;
    }
    //Редактирование времени брони

   /* @Future
    @RequestBody
    LocalDateTime newTime*/
    @PutMapping("/editTime/{id}")
    public int editTime(
            @Positive
            @PathVariable
                    ("id") int idBooking,

            @RequestParam
            LocalDateTime time){
        return 5;
    }

    //Получение списка завершенных броней (предотавленные услуги)
    @GetMapping("/complited")
    public List<BookingResponseDTO> getComplitedBookings() {
        //log.info("GET request with animal type = {}", type);
        return null;
    }

}



