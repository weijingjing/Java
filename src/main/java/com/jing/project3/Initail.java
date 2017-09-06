package com.jing.project3;

/**
 * Created by weijj on 2017/9/6.
 */
public class Initail {
    public static void main(String[] args) {
        /*
        Animal obj1 = new Animal();
        //父类的引用可以指向子类的引用
        Animal obj2 = new Dog();
        Animal obj3 = new Cat();
        obj1.eat();
        obj2.eat();
        obj3.eat();
        obj2.watchDoor();
        */

        Dog dog = new Dog();
        //向下类型转换，自动类型转换
        Animal animal = dog;
        if(animal instanceof Dog){
            Dog dog2 = (Dog)animal;
        }else{
            System.out.println("无法进行类型转换 转换成Dog类型");
        }
        if(animal instanceof Cat){
            Cat cat = (Cat)animal;//1.编译时 Cat类型 2.运行时 Dog类型
        }else{
            System.out.println("无法进行类型转换 转换成Cat类型");
        }

    }

}
