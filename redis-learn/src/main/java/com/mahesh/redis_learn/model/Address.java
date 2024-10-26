package com.mahesh.redis_learn.model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address implements Serializable {
    private String street;

    private String city;

    private String state;

    private String country;
}
