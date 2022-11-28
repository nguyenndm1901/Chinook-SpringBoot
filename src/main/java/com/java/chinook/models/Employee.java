package com.java.chinook.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="Employee")
public class Employee {
    @Id
    int EmployeeId;
    String LastName;
    String FirstName;
    String Title;
    int ReportsTo;
    Date BirthDate;
    Date HireDate;
    String Address;
    String City;
    String State;
    String Country;
    String PostalCode;
    String Phone;
    String Fax;
    String Email;

    public Employee() {
    }

    public Employee(int employeeId, String lastName, String firstName, String title, int reportsTo, Date birthDate, Date hireDate, String address, String city, String state, String country, String postalCode, String phone, String fax, String email) {
        EmployeeId = employeeId;
        LastName = lastName;
        FirstName = firstName;
        Title = title;
        ReportsTo = reportsTo;
        BirthDate = birthDate;
        HireDate = hireDate;
        Address = address;
        City = city;
        State = state;
        Country = country;
        PostalCode = postalCode;
        Phone = phone;
        Fax = fax;
        Email = email;
    }

    public int getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(int employeeId) {
        EmployeeId = employeeId;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getReportsTo() {
        return ReportsTo;
    }

    public void setReportsTo(int reportsTo) {
        ReportsTo = reportsTo;
    }

    public Date getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(Date birthDate) {
        BirthDate = birthDate;
    }

    public Date getHireDate() {
        return HireDate;
    }

    public void setHireDate(Date hireDate) {
        HireDate = hireDate;
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
}
