package com.springboot.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "university")
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String location;

//    @OneToMany(mappedBy = "university")
//    //@JoinColumn(name = "university_id", referencedColumnName = "university_id")
//    List<Student> student = new ArrayList<Student>();

    public University(Integer id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }
    public University(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
