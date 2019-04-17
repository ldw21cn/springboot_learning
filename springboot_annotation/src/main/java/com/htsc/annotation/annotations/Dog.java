package com.htsc.annotation.annotations;


import java.lang.reflect.InvocationTargetException;

/**
 * @Author lvdawei
 * @Date 2019/4/17 13:49
 * @Version 1.0
 */
public class Dog {


    @Action
    public void say(){
        System.out.println("小狗会说话...");
    }

    @Action(action = "1")
    public void sing() {
        System.out.println("小狗会唱歌...");
    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        Dog dog = new Dog();
        ActionHandle.action(dog);

        System.out.println("ssssxxxxxxxxyyyyyy");
    }

}
