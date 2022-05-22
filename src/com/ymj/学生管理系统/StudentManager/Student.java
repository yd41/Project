package com.ymj.学生管理系统.StudentManager;

/**
 * Auther: ymj
 * 10275
 * 2022/5/22 - 11:16
 */

public class Student {

   private String name;
   private String address;
   private String sid;
   private String gender;
   private int age;


   public Student(){

   }



    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getSid() {
        return sid;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAll(){

        return getName()+"  \t"+getGender()+"  \t"+getAge()+"  \t"+getSid()+"  \t"+getAddress();
    }
}
