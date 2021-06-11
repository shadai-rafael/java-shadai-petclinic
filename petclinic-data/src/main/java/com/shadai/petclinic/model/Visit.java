package com.shadai.petclinic.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "visit")
public class Visit extends BaseEntity {

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "report")
    private String report;

}