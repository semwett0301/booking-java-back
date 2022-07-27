package com.example.code.database.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;


@MappedSuperclass
@Data
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
}
