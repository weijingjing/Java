package com.jing.project4;

/**
 * Created by weijj on 2017/9/6.
 */
public class Initail {
    public static void main(String[] args) {
        TelPhone tel1 = new CellPhone();
        tel1.call();
        tel1.message();
        TelPhone tel2 = new SmartPhone();
        tel2.call();
        tel2.message();

        IplayGame ipl1 = new SmartPhone();
        ipl1.play();
        IplayGame ipl2 = new Psp();
        ipl2.play();

    }
}
