package com.spring.techserv.controller;

import com.spring.techserv.dto.ServiceRequestDTO;
import com.spring.techserv.dto.ServiceResponseDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RequestMapping("/api/v1/techserv")
@RestController
public class ServController {
    //Создание услуги
    @PostMapping
    public Long createService(@Valid @RequestBody ServiceRequestDTO serviceRequest){
        return 0L;
    }
    //Получение услуги по id
    @GetMapping("/{id}")
    public ServiceResponseDTO getServiceById(@PathVariable @Positive int id){
        return null;
    }
    //Получение списка услуг
    @GetMapping
    public List<ServiceResponseDTO> getAllServices(){
        return null;
    }
    //Редактирование услуги
    @PostMapping("/{id}")
    public Long editService(
            @Positive
            @PathVariable
                    ("id") int idSrvice,
            @Valid @RequestBody ServiceRequestDTO serviceRequestDTO){
        return null;
    }
}
