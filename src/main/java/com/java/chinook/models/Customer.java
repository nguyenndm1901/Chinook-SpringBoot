package com.java.chinook.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {
    @Id
    int CustomerId;
    String FirstName;
    String LastName;
    String Company;
    String Address;
    String City;
    String State;
    String Country;
    String PostalCode;
    String Phone;
    String Fax;
    String Email;
    int SupportRepId;

    public Customer() {
    }

    public Customer(int customerId, String firstName, String lastName, String company, String address, String city, String state, String country, String postalCode, String phone, String fax, String email, int supportRepId) {
        CustomerId = customerId;
        FirstName = firstName;
        LastName = lastName;
        Company = company;
        Address = address;
        City = city;
        State = state;
        Country = country;
        PostalCode = postalCode;
        Phone = phone;
        Fax = fax;
        Email = email;
        SupportRepId = supportRepId;
    }

    public int getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(int customerId) {
        CustomerId = customerId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(String postalCode) {
        PostalCode = postalCode;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String fax) {
        Fax = fax;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getSupportRepId() {
        return SupportRepId;
    }

    public void setSupportRepId(int supportRepId) {
        SupportRepId = supportRepId;
    }
}
