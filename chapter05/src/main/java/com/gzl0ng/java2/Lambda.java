package com.gzl0ng.java2;

import java.util.TreeMap;

/**
 * @author 郭正龙
 * @date 2022-08-17
 */
//体会invokedynamic指令

    @FunctionalInterface
    interface Func{
        public boolean func(String str);
}
public class Lambda {
    public void lambda(Func func){
        return;
    }

    public static void main(String[] args) {
        Lambda lambda = new Lambda();
        Func func = s ->{
            return true;
        };

        lambda.lambda(func);

        lambda.lambda(s -> {
            return true;
        });
    }
}
