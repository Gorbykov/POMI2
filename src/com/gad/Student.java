package com.gad;

import java.util.Date;

public class Student implements Person {

    private PersonalInformation personalInformation = null;

    private String faculty = "FAC";

    private int course = -1;

    private Long group = -1L;

    private Date birthday = null;

    public Student()
    {
        this.personalInformation = new PersonalInformation();
    }

    public Student(int id, String firstName, String middleName, String lastName, String phone, String address,
                   String faculty, int course, Long group, Date birthday) {
        this.personalInformation = new PersonalInformation(id, firstName, middleName, lastName, phone, address);
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        this.birthday = birthday;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Long getGroup() {
        return group;
    }

    public void setGroup(Long group) {
        this.group = group;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public int getId() {
        return personalInformation.getId();
    }

    @Override
    public String getFirstName() {
        return personalInformation.getFirstName();
    }

    @Override
    public String getMiddleName() {
        return personalInformation.getMiddleName();
    }

    @Override
    public String getLastName() {
        return personalInformation.getLastName();
    }

    @Override
    public String getPhone() {
        return personalInformation.getPhone();
    }

    @Override
    public String getAddress() {
        return personalInformation.getAddress();
    }

    @Override
    public void setId(int id) {
        personalInformation.setId(id);
    }

    @Override
    public void setFirstName(String firstName) {
        personalInformation.setFirstName(firstName);
    }

    @Override
    public void setMiddleName(String middleName) {
        personalInformation.setMiddleName(middleName);
    }

    @Override
    public void setLastName(String lastName) {
        personalInformation.setLastName(lastName);
    }

    @Override
    public void setPhone(String phone) {
        personalInformation.setPhone(phone);
    }

    @Override
    public void setAddress(String address) {
        personalInformation.setAddress(address);
    }
}
