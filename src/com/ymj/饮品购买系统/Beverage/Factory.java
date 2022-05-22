package com.ymj.饮品购买系统.Beverage;

/**
 * Auther: ymj
 * 10275
 * 2022/5/1 - 14:22
 */

public class Factory {

    public static Beverage factory(String kind, String note, String size, String ice, int num) {

        Beverage ret = new Beverage();
        switch (kind) {
            case "可乐" -> {
                ret = new Coke();
                ret.setKind(kind);
                ret.setIce(ice);
                ret.setSize(size);
                ret.setNote(note);
                ret.setNum(num);
            }
            case "咖啡" -> {
                ret = new Coffee();
                ret.setKind(kind);
                ret.setIce(ice);
                ret.setSize(size);
                ret.setNote(note);
                ret.setNum(num);
            }
            case "奶茶" -> {
                ret = new milkTea();
                ret.setKind(kind);
                ret.setIce(ice);
                ret.setSize(size);
                ret.setNote(note);
                ret.setNum(num);
            }
        }

        return ret;
    }


}
