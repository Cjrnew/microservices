package com.cjrnew.hrworker.entity;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_worker")
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double dailyIncome;

}
