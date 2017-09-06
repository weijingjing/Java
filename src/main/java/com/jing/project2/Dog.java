package com.jing.project2;

/**
 * Created by weijj on 2017/9/6.
 */
public class Dog extends Animal {
    public int age = 20;
    public String name = "Angela";
    public void eat(){
        System.out.println("狗吃骨头");
    }
    public void method() {
        eat();
    }
    public Dog() {
        System.out.println("Dog无参的构造方法");
    }

/*判断两个对象的实例是否相同
* this指向当前对象
* super指向父级对象，被super修饰的是最终类--常量
* */
    @Override
    public boolean equals(Object obj) {
            //如果雷一个对象和当前对象引用都一样，那么肯定是同一个对象实例，返回true
        if(this == obj) {
            return true;
        } else if(obj == null) {
            //判断这个对象是否为空，若为null返回false
            return false;
        } else if(this.getClass() != obj.getClass()) {
            //如果另一个对象和当前对象类型都不一样，返回false
            return false;
        } else {
            //目前为止，传入的对象肯定和当前对象类型一样，直接转换
            /*(Dog)obj是将父类强制装换成子类  Dog other = (Dog)obj;
            *如果将子类类型转换成父类类型，则不需要加（类型） Dog dog = new Dog();
            * */
            Dog other = (Dog)obj;
            return this.age == other.age;
        }
    }

}
