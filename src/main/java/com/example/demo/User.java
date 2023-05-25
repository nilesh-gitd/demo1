package com.example.demo;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userID;
    private String name;
    private String address;
    private String DOB;


    public User(int userID, String name, String address, String dOB) {
        super();
        this.userID = userID;
        this.name = name;
        this.address = address;
        DOB = dOB;
    }
    @Override
    public String toString() {
        return "User [userID=" + userID + ", name=" + name + ", address=" + address + ", DOB=" + DOB + "]";
    }
    public User() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void setUserID(int userID) {
        this.userID = userID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getDOB() {
        return DOB;
    }
    public void setDOB(String dOB) {
        DOB = dOB;
    }
    public int getUserID() {
        return userID;}
}
