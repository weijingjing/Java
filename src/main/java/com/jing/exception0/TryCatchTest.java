package com.jing.exception0;

/**
 * Created by weijj on 2017/9/7.
 */
public class TryCatchTest {
    public static void main(String[] args) {
        TryCatchTest tct = new TryCatchTest();
        int result = tct.test1();
        System.out.println("循环报错了，执行了test1(),返回结果：" + result);
        int result2 = tct.test2();
        System.out.println("循环报错了，执行了test2(),返回结果：" + result2);
        int result3 = tct.test3();
        System.out.println("循环报错了，执行了test2(),返回结果：" + result3);
    }


    /**
     * divider(除数):
     * result(结果):
     * try-catch捕获while循环
     * 每次循环，divider减一，result=result+100/divider
     * 如果：捕获异常，打印输出”抛出异常了！！！“，返回-1
     * 否则：返回result
     */
    public int test1() {
        int divider = 10;
        int result = 100;
        try {
            while (divider > -1) {
                divider--;
                result = result + 100 / divider;
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("test1()抛出异常");
            return -1;
        }
    }

    /**
     * divider(除数):
     * result(结果):
     * try-catch捕获while循环
     * 每次循环，divider减一，result=result+100/divider
     * 如果：捕获异常，打印输出”抛出异常了！！！“，返回 result=999；
     * 否则：返回result
     * finally：打印输出”这是finally！！！哈哈！！“，同时打印输出result的值
     */
    public int test2() {
        int divider = 10;
        int result = 100;
        try {
            while (divider > -1) {
                divider--;
                result = result + 100 / divider;
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("test2()抛出异常了！！！");
            return 999;
        } finally {
            System.out.println("这是finally！！！result的值：" + result);
        }
    }


    /**
     * divider(除数):
     * result(结果):
     * try-catch捕获while循环
     * 每次循环，divider减一，result=result+100/divider
     * 如果：捕获异常，打印输出”抛出异常了！！！“
     * finally：打印输出”这是finally！！！哈哈！！“，同时打印输出result的值
     * 最后，返回1111做为结果
     */
    public int test3() {
        int divider = 10;
        int result = 100;
        try {
            while (divider > -1) {
                divider--;
                result = result + 100 / divider;
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("test3()抛出异常了！！！result的值：" + result);
        } finally {
            System.out.println("这是finally！！！result的值：" + result);
        }
        System.out.println("最终执行完毕了！！！result的值：" + result);
        return 1111;
    }
}