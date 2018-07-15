package com.step.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String fatherName;
    private String gender;
    private String nationality;
    private String phoneNumber;
    private String address;
    private int duration;
    private Date dateOfBirth;
    private String username;
    private String password;
    private List<Language> languages;

     public Student() {
         languages = new ArrayList<>();
    }
    
    public Student(int id, String firstName, String lastName, String fatherName, String gender, String nationality, String phoneNumber, String address, int duration, Date dateOfBirth, String username, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.gender = gender;
        this.nationality = nationality;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.duration = duration;
        this.dateOfBirth = dateOfBirth;
        this.username = username;
        this.password = password;
        languages = new ArrayList<>();
    }

    public Student(String firstName, String lastName, String fatherName, String gender, String nationality, String phoneNumber, String address, int duration, Date dateOfBirth, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.gender = gender;
        this.nationality = nationality;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.duration = duration;
        this.dateOfBirth = dateOfBirth;
        this.username = username;
        this.password = password;
    }
    
    

    public List<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }

    public void addLangage(Language lang){
        languages.add(lang);
    }
   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
