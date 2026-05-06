package com.spring.techserv.mapper;

import com.spring.techserv.dto.ServiceRequestDTO;
import com.spring.techserv.entity.TechService;
import org.springframework.stereotype.Service;

@Service
public class ServiceMapper {
    public static TechService mapToEntity(ServiceRequestDTO serviceRequest) {
        return TechService.builder()
                .title(serviceRequest.title())
                .cost(serviceRequest.cost())
                .build();
    }
}


