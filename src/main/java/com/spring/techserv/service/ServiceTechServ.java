package com.spring.techserv.service;

import com.spring.techserv.dto.ServiceRequestDTO;
import com.spring.techserv.entity.TechService;
import com.spring.techserv.mapper.ServiceMapper;
import com.spring.techserv.repository.ServiceRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ServiceTechServ {
    private final ServiceRepository serviceRepository;
    private final ServiceMapper serviceMapper;

    public Long registerService(@Valid ServiceRequestDTO serviceRequest) {
        TechService techService = serviceMapper.mapToEntity(serviceRequest);
        System.out.println(techService.toString());
        serviceRepository.save(techService);
        return techService.getId();
    }




}
