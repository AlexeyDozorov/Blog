package com.alexeydozorov.web.models;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "users")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "idBox")
    private int idBox;

    @Column(name = "email")
    private String email;

    @Column(name = "number")
    private String number;

    public Orders() {
    }

    public Orders(int idBox, String email, String number) {
        this.idBox = idBox;
        this.email = email;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdBox() {
        return idBox;
    }

    public void setIdBox(int idBox) {
        this.idBox = idBox;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
