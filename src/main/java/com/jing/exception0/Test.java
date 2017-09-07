package com.jing.exception0;

/**
 * Created by weijj on 2017/9/7.
 */
public class Test {
    /**
     * test1():抛出“喝大了”异常
     * test2():调用test1(),捕获“喝大了”异常，并且包装成运行时异常，继续抛出
     * main方法中，调用test2(),尝试捕获test2()方法抛出的异常
     */
    public static void main(String[] args) {
        Test t = new Test();
        try {
            t.test2();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void test1() throws Exception{
         throw new Exception("开车别喝酒");
    }
    public void test2() {
        try {
            System.out.println("喝大了");
        }
        catch (Exception e){
            RuntimeException re = new RuntimeException();
            throw re;
        }
    }
}
