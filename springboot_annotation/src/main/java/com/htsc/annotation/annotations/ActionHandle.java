package com.htsc.annotation.annotations;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author lvdawei
 * @Date 2019/4/17 13:47
 * @Version 1.0
 *
 * 注解处理器，对自定义注解做处理
 */
public class ActionHandle {
    public static void action(Object obj) throws InvocationTargetException, IllegalAccessException {

        /**
         * 获取定义的方法
         */
        Method[] methods = obj.getClass().getDeclaredMethods();

        /**
         * 遍历方法
         */
        for (Method method : methods) {
            // 当前的方法有注解，则进入
            if (method.isAnnotationPresent(Action.class)) {
                Action annotation = method.getAnnotation(Action.class);
                String action = annotation.action();

                // 当前方法的注解值为0，则调用
                if (action.equals("0")) {
                    method.invoke(obj);
                }
            }
        }
    }
}
