package com.shadai.petclinic.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "vet")
public class Vet extends Person{

    @Builder
    public Vet(Long id, String firstName, String lastName, String address, String telephone,
               String city) {
        super(id, firstName, lastName, address, telephone, city);

    }

}
