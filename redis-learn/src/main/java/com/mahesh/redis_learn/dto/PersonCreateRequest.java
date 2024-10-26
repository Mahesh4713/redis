package com.mahesh.redis_learn.dto;

import com.mahesh.redis_learn.model.Address;

import com.mahesh.redis_learn.model.Person;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.UUID;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PersonCreateRequest {

    @NotBlank
    private String name;

    private String age;

    private Address address;

    public Person to(){
        return Person.builder()
                .name(this.name)
                .age(this.age)
                .address(this.address)
                .id(UUID.randomUUID().toString())
                .build();
    }
}
