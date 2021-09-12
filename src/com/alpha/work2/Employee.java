package com.alpha.work2;

public class Employee {
    private String firstName;
    private String lastName;
    private String occupation;
    private String telephone;
    private static int numberOfEmployees;

    public Employee(String firstName, String lastName, String occupation) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
    }

    public Employee(String firstName, String lastName, String occupation, String telephone) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.telephone = telephone;
    }

    public Employee() {
        numberOfEmployees++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getTelephone() {
        return telephone;
    }

    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    @Override
    public String toString() {
        String out = "Employee{" +
                "numberOfEmployees='" + numberOfEmployees + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", occupation='" + occupation + '\'' ;
                if(telephone != null) {
                    out += ", telephone='" + telephone + '\'';
                }

         out +=    '}';
                return out;
    }
}
