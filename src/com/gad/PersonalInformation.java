package com.gad;

public class PersonalInformation implements Person {

    private int id = -1;

    private String firstName = "First";

    private String middleName = "Middle";

    private String lastName = "Last";

    private String phone = "0000000";

    private String address = "Nowhere";

    public PersonalInformation() {
    }

    public PersonalInformation(int id, String firstName, String middleName, String lastName, String phone, String address) {
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

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getMiddleName() {
        return middleName;
    }

    @Override
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getPhone() {
        return phone;
    }

    @Override
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("%4d", id) + "| " + lastName + " " + firstName.charAt(0) + ". " + lastName.charAt(0) + ". ";
    }
}
