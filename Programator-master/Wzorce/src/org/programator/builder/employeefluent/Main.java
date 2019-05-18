package org.programator.builder.employeefluent;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//        Employee empA = new Employee(
//                1,
//                "Jan",
//                "Kowalski",
//                LocalDate.of(1990, 6, 7),
//                "Gdańsk"
//        );
//
//        System.out.println(empA);
//        System.out.println(empA.getAge());
//
        EmployeeBuilder eb = new EmployeeBuilder();
        Employee empB = eb
                .withBirthDate(LocalDate.of(1983, 1, 1))
                .withFirstName("Kaziu")
                .withLastName("Nowak")
                .withCity("Słupsk")
                .withFirstName("Jarosław")
                .getEmploy();

        System.out.println(empB);
        System.out.println(empB.getAge());

        System.out.println(eb.withFirstName("Ala").getEmploy());
        System.out.println(eb.reset().withFirstName("Zosia").getEmploy());

//        Employee empB2 = eb
//                .withBirthDate(LocalDate.of(1900, 1, 1))
//                .getEmploy();
//
//        System.out.println(empB2);
//        System.out.println(empB2.getAge());
//        System.out.println(empB == empB2);
    }
}
