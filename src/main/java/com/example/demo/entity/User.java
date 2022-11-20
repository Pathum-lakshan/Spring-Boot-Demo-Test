package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(name = "getAllUser", procedureName = "GetUser"),
        @NamedStoredProcedureQuery(name = "getAllUserByID", procedureName = "GetUserByID", parameters = {@StoredProcedureParameter(mode = ParameterMode.IN,name = "id",type=Integer.class)} )
})
public class User {
    @Id
    private int id;
    private String name;
    private String address;
}

