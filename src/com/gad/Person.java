package com.gad;

public class Person implements Comparable {

    private int id = -1;

    private String firstName = "First";

    private String middleName = "Middle";

    private String lastName = "Last";

    private String phone = "0000000";

    private String address = "Nowhere";

    public Person() {
    }

    public Person(int id, String firstName, String middleName, String lastName, String phone, String address) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }

    @Override
    public int compareTo(Object o) {
        Person s = (Person) o;
        return this.getLastName().compareTo(s.getLastName());
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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("%4d", id) + "| " + lastName + " " + firstName.charAt(0) + ". " + lastName.charAt(0) + ". ";
    }
}
