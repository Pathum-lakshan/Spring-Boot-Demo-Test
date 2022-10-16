package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * ALE IS TER
 * 10/16/2022
 * 9:30 AM
 * Spring-Boot-Demo-Test
 * com.example.demo.dto
 * UserDTO
 */

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDTO {
    @Id
    private int id;
    private String name;
    private String address;
}
