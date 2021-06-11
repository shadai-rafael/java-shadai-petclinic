package com.shadai.petclinic.model;

import java.time.LocalDate;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pet")
public class Pet extends BaseEntity{

    @Builder
    public Pet(Long id, String name, Specie specie, Genre genre, Breed breed,
               LocalDate birthDate) {
        super(id);
        this.name = name;
        this.breed = breed;
        this.specie = specie;
        this.birthDate = birthDate;
    }

    @Column(name = "name")
    String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "specie")
    private Specie specie;

    @Enumerated(EnumType.STRING)
    @Column(name = "genre")
    private Genre genre;

    @Enumerated(EnumType.STRING)
    @Column(name = "breed")
    private Breed breed;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "birth_date")
    private LocalDate birthDate;
}
