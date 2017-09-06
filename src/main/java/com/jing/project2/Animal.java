package com.jing.project2;

/**
 * Created by weijj on 2017/9/6.
 */
public class Animal {
    public int age;
    public String name;

    public void eat(){
        System.out.println("动物具有吃东西的能力");
    }
    public Animal(){
        System.out.println("Animal无参的构造方法");
    }

    public Animal(int newAge,String newName){
        this.age = newAge;
        this.name = newName;
    }
}
