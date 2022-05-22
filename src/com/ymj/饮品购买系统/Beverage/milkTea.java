package com.ymj.饮品购买系统.Beverage;

/**
 * Auther: ymj
 * 10275
 * 2022/5/1 - 14:19
 */

public class milkTea extends Beverage{

    public static final String name="奶茶";
    public static final int mid_price=6;
    public static final int big_price=12;
    public static final int supbig_price=18;

    public void showInfo() {
        super.showInfo();
        switch (super.getSize()) {
            case "中杯" -> System.out.println(mid_price + "*" + super.getNum() + "=" + mid_price * super.getNum()+"元");
            case "大杯" -> System.out.println(big_price + "*" + super.getNum() + "=" + big_price * super.getNum()+"元");
            case "特大杯" -> System.out.println(supbig_price + "*" + super.getNum() + "=" + supbig_price * super.getNum()+"元");
        }
    }

    public static void query(){
        System.out.println("------奶茶种类------\n红豆奶茶\t椰果奶茶\t布丁奶茶\t珍珠奶茶");

        System.out.printf("------奶茶价格------\n中杯 %d 元\t大杯 %d 元\t超大杯 %d 元\n",mid_price,big_price,supbig_price);

    }
}
