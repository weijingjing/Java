package com.jing.exception1;

import java.util.Scanner;

/**
 * Created by weijj on 2017/9/7.
 * 异常要学会的内容
 * 1. 能自己定义异常吗?
 * 2. 受检 非受检日常分的清楚吗?
 * 3. 自己的造一个空指针异常吗?
 */
public class BookManagerEasy {
    private static Scanner console = new Scanner(System.in);
    public static void main(String args[]){
        //定义图书数组
        String[] books = {"java","springMVC","html","css","javascript","jquery"};
        while (true){
            System.out.println("请输入您的操作：1.按照名称查找图片 2.按照序号查找图书");
            String book;
            try {
            int command = inputCommand();
                switch (command){
                    case 1:
                        book = getBookByName(books);
                        System.out.println("book:" + book);
                        break;
                    case 2:
                        book = getBookByNumber(books);
                        System.out.println("book:" + book);
                        break;
                    case -1:
                        System.out.println("输入有误，请重新输入");
                        continue;
                    default:
                        System.out.println("输入有误");
                        continue;
                }
                break;
            }catch (Exception bne){
                System.out.println(bne.getMessage());
                continue;
            }
        }
    }

    //按照名称查找图书
    public static String getBookByName(String[] books) throws Exception {
        System.out.println("请选择查找的图书：");
        String name = console.next();
        for (int i = 0; i < books.length; i++) {
            if (name.equals(books[i]))
                //输入名称与某一图书名称匹配，返回该图书
                return books[i];
        }
        throw new Exception("没有找到这本书");
    }

    //按照序号查找图书
    public static String getBookByNumber(String[] books) throws Exception{
        while (true){
            System.out.println("请输入图书编号：");

        try {
            int index = inputCommand();
            if (index == -1){
                System.out.println("输入的命令有误，请重新输入");
                continue;
            }
            String book = books[index];
            return book;
        }catch (ArrayIndexOutOfBoundsException e){
            Exception bookNotExists = new Exception();
            bookNotExists.initCause(e);
            throw bookNotExists;
        }
    }
    }

        //从控制台输入命令，用于输入图书名称和图书编号
        public static int inputCommand(){
              int command;
            try {
              command = console.nextInt();
                return command;
            }catch (Exception e){
                console = new Scanner(System.in);
                return -1;
            }
        }
}


