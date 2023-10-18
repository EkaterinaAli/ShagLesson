package model;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Employee {

    private int id;
    private String name;
    private String lastName;
    private int age;
    private Office office;
    //private int officeId;
    private Passport passportId;
    private Timestamp updatedTs;
    private Timestamp createdTs;
}
