package com.pankajan05.moodle.department;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Department {
    @Id
    @GeneratedValue()
    private Long Dep_Id;
    private String Department_name;

}
