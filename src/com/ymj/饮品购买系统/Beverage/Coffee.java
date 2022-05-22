package com.ymj.饮品购买系统.Beverage;

/**
 * Auther: ymj
 * 10275
 * 2022/5/1 - 14:16
 */

public class Coffee extends Beverage {

    public static final String name = "咖啡";
    public static final int mid_price = 7;
    public static final int big_price = 14;
    public static final int supbig_price = 21;

    public static void query() {
        System.out.println("------咖啡种类------\n拿铁\t卡布奇洛\t摩卡");

        System.out.printf("------咖啡价格------\n中杯 %d 元\t大杯 %d 元\t超大杯 %d 元\n", mid_price, big_price, supbig_price);

    }

    public void showInfo() {
        super.showInfo();
        switch (super.getSize()) {
            case "中杯" -> System.out.println(mid_price + "*" + super.getNum() + "=" + mid_price * super.getNum()+"元");
            case "大杯" -> System.out.println(big_price + "*" + super.getNum() + "=" + big_price * super.getNum()+"元");
            case "特大杯" -> System.out.println(supbig_price + "*" + super.getNum() + "=" + supbig_price * super.getNum()+"元");

        }
    }
}
