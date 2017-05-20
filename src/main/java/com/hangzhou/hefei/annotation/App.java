package com.hangzhou.hefei.annotation;

import java.lang.annotation.Annotation;

/**
 * App Main Entrance
 *
 * @author hefei.hfei@alibaba-inc.com
 * @create 2017-05-19 23:16
 */
public class App {

    public static void main(String[] args) {
        Category annotation = Dog.class.getAnnotation(Category.class);
        System.out.println(annotation.annotationType());
    }
}
