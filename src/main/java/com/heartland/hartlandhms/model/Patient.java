package com.heartland.hartlandhms.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "patient")
public class Patient implements Serializable {

    private long id;
    private String hospitalID;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String address;

    public Patient(String firstName, String lastName, String hospitalID, String phone, String email, String address)  {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hospitalID = hospitalID;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "first_name", nullable = false)
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name", nullable = false)
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "hospital_id", nullable = false)
    public String getHospitalID() {
        return hospitalID;
    }
    public void setHospitalID(String hospitalID) {
        this.hospitalID = hospitalID;
    }
    @Column(name = "phone", nullable = false)
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    @Column(name = "email", nullable = false)
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Column(name = "address", nullable = false)
    public String getAddress() {
        return address;
    }
    public void getHospitalID(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Patient [id="
                + id
                + ", firstName=" + firstName
                + ", lastName=" + lastName
                + ", hospitalID=" + hospitalID
                + ", Phone=" + phone
                +  ", Email=" + email
                +  ", Address=" + address
                +  ",]";
    }

}
