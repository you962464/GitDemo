package com.zy.entity;

import java.io.Serializable;


public class StudentModel implements Serializable {

    private int id;
    private String name;
    private String sex;
    private String aihao;
    private String address;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAihao() {
        return aihao;
    }

    public void setAihao(String aihao) {
        this.aihao = aihao;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public StudentModel(int id, String name, String sex, String aihao, String address) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.aihao = aihao;
        this.address = address;
    }

    public StudentModel() {
    }

    @Override
    public String toString() {
        return "StudentModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", aihao='" + aihao + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
