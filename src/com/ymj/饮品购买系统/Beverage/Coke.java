package com.ymj.饮品购买系统.Beverage;

/**
 * Auther: ymj
 * 10275
 * 2022/5/1 - 13:38
 */

public class Coke extends Beverage {

    public static final String name = "可乐";
    public static final int mid_price = 5;
    public static final int big_price = 10;
    public static final int supbig_price = 15;

    public void showInfo() {
        super.showInfo();
        switch (super.getSize()) {

            case "中杯":
                System.out.println(mid_price + "*" + super.getNum() + "=" + mid_price * super.getNum()+"元");
                break;
            case "大杯":
                System.out.println(big_price + "*" + super.getNum() + "=" + big_price * super.getNum()+"元");
                break;
            case "特大杯":
                System.out.println(supbig_price + "*" + super.getNum() + "=" + supbig_price * super.getNum()+"元");
                break;
            default:
                ;
        }
    }
    public static void query(){
        System.out.println("------可乐种类------\n可口可乐\t百事可乐");

        System.out.printf("------可乐价格------\n中杯 %d 元\t大杯 %d 元\t超大杯 %d 元\n",mid_price,big_price,supbig_price);

    }
}