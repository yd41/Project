package com.ymj.学生管理系统.StudentManager;

import java.util.Scanner;

/**
 * Auther: ymj
 * 10275
 * 2022/5/22 - 13:24
 */

public class findStudent {

    public static int find(){
        System.out.println("请输入学生的学号");
        Scanner input = new Scanner(System.in);
        String sid=input.nextLine();
        for (int i = 0; i < studentArray.sudentarray.size(); i++) {
            if(sid.equals(studentArray.sudentarray.get(i).getSid())){
                return i;
            }

            if (i==studentArray.sudentarray.size()-1){
                System.out.println("查无此人");
            }

        }
        return -1;
    }
}
