package com.avengers.StudentManagement;

public class Student {
    private String name;
    private int age;
    private int enrollmentNo;
    private int admnNo;
    private String state;

    public Student(String name, int age, int enrollmentNo, int admnNo, String state) {
        this.name = name;
        this.age = age;
        this.enrollmentNo = enrollmentNo;
        this.admnNo = admnNo;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEnrollmentNo() {
        return enrollmentNo;
    }

    public void setEnrollmentNo(int enrollmentNo) {
        this.enrollmentNo = enrollmentNo;
    }

    public int getAdmnNo() {
        return admnNo;
    }

    public void setAdmnNo(int admnNo) {
        this.admnNo = admnNo;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


}
