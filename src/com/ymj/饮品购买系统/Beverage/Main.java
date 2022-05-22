package com.ymj.饮品购买系统.Beverage;


/**
 * Auther: ymj
 * 10275
 * 2022/5/1 - 14:35
 */

public class Main {

    public static void main(String[] args) {

        String kind = choice.choice_kind();
        assert kind != null;
        String note = choice.choice_note(kind);
        String size = choice.choice_size();
        String ice = choice.choice_ice();
        int num = choice.choice_num();
        Beverage beverage=Factory.factory(kind,note,size,ice,num);

        beverage.showInfo();


    }
}
