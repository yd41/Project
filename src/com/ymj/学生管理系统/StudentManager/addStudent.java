package com.ymj.学生管理系统.StudentManager;

import java.util.Scanner;

/**
 * Auther: ymj
 * 10275
 * 2022/5/22 - 12:14
 */

public class addStudent {

//    String name;
//    String sid;
//    String address;
//    int age;
//    Scanner input = new Scanner(System.in);

    public static Student addstudent(Student student){


        Scanner input = new Scanner(System.in);
        System.out.println("请输入姓名");
        student.setName(input.nextLine());
        System.out.println("请输入性别");
        student.setGender(input.nextLine());
        System.out.println("请输入学号");
        student.setSid(input.nextLine());
        System.out.println("请输入年龄");
        student.setAge(input.nextInt());
        System.out.println("请输入地址");
        input.nextLine();
        student.setAddress(input.nextLine());
        return student;
    }

}
