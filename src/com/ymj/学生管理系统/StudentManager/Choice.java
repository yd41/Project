package com.ymj.学生管理系统.StudentManager;

import java.util.Scanner;

/**
 * Auther: ymj
 * 10275
 * 2022/5/22 - 13:40
 */

public class Choice {

    static int judge;

    public static void choice() {
        Scanner input = new Scanner(System.in);

        do{
            Print.Interface();
            judge = input.nextInt();
            Student student=new Student();

            switch (judge){
                //添加学生
                case 1->{
                    studentArray.sudentarray.add(addStudent.addstudent(student));
                }
                //修改学生
                case 2->{
//                    Print.allInfo(studentArray.sudentarray);
                    int index=findStudent.find();
                    if (index!=-1){
//                        addStudent.addstudent(studentArray.sudentarray.get(index));
                        reviseStudent.revisestudent(studentArray.sudentarray.get(index));
                    }
                }
                //删除学生
                case 3->{
//                    Print.allInfo(studentArray.sudentarray);
                    int index=findStudent.find();
                    if (index!=-1){
//                        studentArray.sudentarray.remove(index);
                        deleteStudent.deletestudent(studentArray.sudentarray.get(index));
                    }
                }
                //查看所有学生
                case 4->{
                    Print.allInfo(studentArray.sudentarray);
                }
                //退出
                case 0->{
                    judge=0;
                }
                default -> {
                    System.out.println("无效操作，请重新输入");
                }
            }
        }while (judge!=0);
    }


}
