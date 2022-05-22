package com.ymj.学生管理系统.StudentManager;

import java.util.ArrayList;

/**
 * Auther: ymj
 * 10275
 * 2022/5/22 - 12:02
 */

public class Print {

    public static void Interface(){

        System.out.println("------学生管理系统------");
        System.out.println("1:添加学生");
        System.out.println("2:修改学生");
        System.out.println("3:删除学生");
        System.out.println("4:查看所有学生");
        System.out.println("0:退出");
        System.out.println("请选择操作");
    }



public static void info(Student student){
    System.out.println("姓名 \t性别 \t年龄 \t学号 \t地址");
    System.out.println(student.getAll());
}


//打印所有信息
public static void allInfo(ArrayList<Student> studentArray){

    for (Student student : studentArray) {
        info(student);
    }

}






}
