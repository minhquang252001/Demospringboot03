package com.cybersoft.demospringboot03.payload.request;

import java.util.List;

public class StudentRequest {

    private String name;
    private int age;
//    private List<StudentRequest> list;
    public String getName() {
        return name;
    }

//    public List<StudentRequest> getList() {
//        return list;
//    }

//    public void setList(List<StudentRequest> list) {
//        this.list = list;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return "StudentRequest{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
}
