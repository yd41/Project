package com.ymj.饮品购买系统.Beverage;

/**
 * Auther: ymj
 * 10275
 * 2022/5/1 - 13:31
 */

public class Beverage {
    private String kind;
    private String size;
    private String ice;
    private String note;
    private int num;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getIce() {
        return ice;
    }

    public void setIce(String ice) {
        this.ice = ice;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }


    public void showInfo(){
        System.out.print("订单信息："+"你购买了 "+this.kind+" ---> "+this.note+"  购买的是 "+this.size+"  购买数量 "+this.num+"杯"+" 总价 ");
    }

}
