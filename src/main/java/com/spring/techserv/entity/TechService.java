package com.spring.techserv.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Builder
@Getter
@Setter
@Entity
@Table(name = "services")
@NoArgsConstructor
@AllArgsConstructor
public class TechService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "cost")
    private BigDecimal cost;

    @Override
    public String toString() {return "id=" + id +" "+ title +" " + cost; }
}
