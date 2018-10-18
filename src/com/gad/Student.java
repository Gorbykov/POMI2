package com.gad;

import java.util.Date;

public class Student extends  PersonalInformation{

    private String faculty = "FAC";

    private int course = -1;

    private Long group = -1L;

    private Date birthday = null;

    public Student() {
    }

    public Student(int id, String firstName, String middleName, String lastName, String phone, String address,
                   String faculty, int course, Long group, Date birthday) {
        super(id, firstName, middleName, lastName, phone, address);
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
}
