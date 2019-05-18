package org.programator.builder.employeefluent;

import java.time.LocalDate;

public class EmployeeBuilder {
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String city;

    public EmployeeBuilder(){
        init();
    }

    public Employee Build() {
        return new Employee(id, firstName, lastName, birthDate, city);
    }

    public EmployeeBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public EmployeeBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public EmployeeBuilder withBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public EmployeeBuilder withCity(String city) {
        this.city = city;
        return this;
    }

    public Employee getEmploy() {
        return this.Build();
    }

    private void init() {
        id = 1;
        firstName = "first";
        lastName = "last";
        birthDate = LocalDate.now();
        city = "city";
    }

    public EmployeeBuilder reset() {
        init();
        return this;
    }
}
