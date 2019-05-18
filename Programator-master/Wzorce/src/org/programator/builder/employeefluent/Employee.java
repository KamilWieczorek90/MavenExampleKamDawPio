package org.programator.builder.employeefluent;

import java.time.LocalDate;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String city;

    public Employee(int id, String firstName, String lastName, LocalDate birthDate, String city) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.city = city;
    }

    public String getFullName() {
        return this.getFirstName() + " " + this.getLastName();
    }

    public int getAge() {
        LocalDate today = LocalDate.now();
        int age = today.getYear() - birthDate.getYear();
        if (birthDate.compareTo(today.plusDays(-age)) > 0) age--;
        return age;
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", city='" + city + '\'' +
                '}';
    }
}
