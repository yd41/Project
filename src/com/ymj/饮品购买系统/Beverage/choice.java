package com.ymj.饮品购买系统.Beverage;

import java.util.Scanner;

/**
 * Auther: ymj
 * 10275
 * 2022/5/1 - 15:29
 */

public class choice {

    public static String choice_kind() {
        Scanner input = new Scanner(System.in);

        System.out.println("------请选择饮品------（输入编号查询，按0退出查询）");
        System.out.println("1.可乐   2.奶茶   3.咖啡");


        while (true) {
            int choice_kind = input.nextInt();
            while (choice_kind != 1 && choice_kind != 2 && choice_kind != 3 && choice_kind != 0) {
                System.out.println("输入有误，请重新输入！（查询种类）");
                System.out.println("1.可乐   2.奶茶   3.咖啡");
                choice_kind = input.nextInt();
            }
            if (choice_kind == 0)
                break;
            switch (choice_kind) {
                case 1 -> {
                    Coke.query();
                }
                case 2 -> {
                    milkTea.query();
                }
                case 3 -> {
                    Coffee.query();
                }
            }
            System.out.println("\n\n------请选择饮品------（输入编号查询，按0退出查询）");
            System.out.println("1.可乐   2.奶茶   3.咖啡");
        }

        System.out.println("------请确定你的最终选择------");
        System.out.println("1.可乐   2.奶茶   3.咖啡");
        int choice_kind = input.nextInt();
        while (choice_kind != 1 && choice_kind != 2 && choice_kind != 3) {
            System.out.println("输入有误，请重新输入！（选择种类）");
            System.out.println("1.可乐   2.奶茶   3.咖啡");
            choice_kind = input.nextInt();
        }
        switch (choice_kind) {
            case 1 -> {
                System.out.println("你的选择是 可乐");

                return "可乐";
            }
            case 2 -> {
                System.out.println("你的选择是 奶茶");

                return "奶茶";
            }
            case 3 -> {
                System.out.println("你的选择是 咖啡");

                return "咖啡";
            }
        }
        return null;
    }


    public static String choice_note(String kind) {

        Scanner input = new Scanner(System.in);
        switch (kind){
            //选择可乐
            case "可乐"->{
                System.out.println("请选择口味（输入编号）\n1.可口可乐\t2.百事可乐");
                int choice_kind=input.nextInt();
                while (choice_kind!=1&&choice_kind!=2){
                    System.out.println("输入有误，请重新输入！（选择口味）");
                    choice_kind=input.nextInt();
                }

                switch (choice_kind){
                    case 1->{
                        System.out.println("你的选择是 可口可乐");
                        return "可口可乐";
                    }
                    case 2->{
                        System.out.println("你的选择是 百事可乐");
                        return "百事可乐";
                    }
                }


            }
            //选择咖啡
            case "咖啡"->{
                System.out.println("请选择口味（输入编号）\n1.拿铁\t2.卡布奇洛\t3.摩卡");
                int choice_kind=input.nextInt();
                while (choice_kind!=1&&choice_kind!=2&&choice_kind!=3){
                    System.out.println("输入有误，请重新输入（选择口味）");
                    choice_kind=input.nextInt();
                }
                switch (choice_kind){

                    case 1->{
                        System.out.println("你的选择是 拿铁");
                        return "拿铁";
                    }
                    case 2->{
                        System.out.println("你的选择是 卡布奇洛");
                        return "卡布奇洛";
                    }
                    case 3->{
                        System.out.println("你的选择是 摩卡");
                        return "摩卡";
                    }

                }

            }
            //选择奶茶
            case "奶茶"->{
                System.out.println("请选择口味（输入编号）\n1.红豆奶茶\t2.椰果奶茶\t3.布丁奶茶\t4.珍珠奶茶");
                int choice_kind=input.nextInt();
                while (choice_kind!=1&&choice_kind!=2&&choice_kind!=3&&choice_kind!=4){
                    System.out.println("输入有误，请重新输入！（选择口味）");
                    choice_kind=input.nextInt();
                }
                switch (choice_kind){

                    case 1->{
                        System.out.println("你的选择是 红豆奶茶");
                        return "红豆奶茶";
                    }
                    case 2->{
                        System.out.println("你的选择是 椰果奶茶");
                        return "椰果奶茶";
                    }
                    case 3->{
                        System.out.println("你的选择是 布丁奶茶");
                        return "布丁奶茶";
                    }
                    case 4->{
                        System.out.println("你的选择是 珍珠奶茶");
                        return "珍珠奶茶";
                    }

                }

            }
        }

        return null;
    }

    public static String choice_size() {
        System.out.println("------请选择大小------（输入编号）\n1.中杯  2.大杯  3.超大杯");
        Scanner input = new Scanner(System.in);

        int choice_size = input.nextInt();
        while (choice_size != 1 && choice_size != 2 && choice_size != 3) {
            System.out.println("输入有误，请重新输入（选择大小）");
            choice_size = input.nextInt();
        }

        switch (choice_size){

            case 1 -> {
                System.out.println("你的选择是 中杯");
                return "中杯";
            }
            case 2->{
                System.out.println("你的选择是 大杯");
                return "大杯";
            }
            case 3->{
                System.out.println("你的选择是 超大杯");
                return "超大杯";
            }

        }

        return null;
    }

    public static String choice_ice(){

        System.out.println("------请选择是否加冰------（输入编号）\n1.加冰  2.不加冰");
        Scanner input = new Scanner(System.in);
        int choice_ice = input.nextInt();
        while (choice_ice != 1 && choice_ice != 2) {
            System.out.println("输入有误，请重新输入！（是否加冰）");
            choice_ice = input.nextInt();
        }
        switch (choice_ice) {
            case 1 -> {
                System.out.println("你的选择是 加冰");
                return "加冰";
            }
            case 2 -> {
                System.out.println("你的选择是 不加冰");
                return "不加冰";
            }
        }
        return null;
    }


    public static int choice_num(){
        System.out.println("------请输入购买数量------");
        Scanner input = new Scanner(System.in);

        return input.nextInt();
    }

}
