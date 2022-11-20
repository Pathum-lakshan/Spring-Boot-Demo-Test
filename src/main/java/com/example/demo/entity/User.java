package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@NamedStoredProcedureQuery()
public class User {
    @Id
    private int id;
    private String name;
    private String address;
}



















/*
@NamedStoredProcedureQuery(name = "secondProcedure", procedureName = "getTicketsByCatagory", parameters = {
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "tcatagory", type = String.class) }) })*/
