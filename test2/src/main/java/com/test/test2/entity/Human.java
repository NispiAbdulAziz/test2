package com.test.test2.entity;

import javax.persistence.*;

@Entity(name = "Human")
@Table(name = "HUMAN")
public class Human {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "phone")
    private String phone;

    public Human() {
    }

    public Human(String id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
