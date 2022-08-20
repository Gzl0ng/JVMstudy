package com.gzl0ng.java;

/**
 * @author 郭正龙
 * @date 2022-08-20
 */
public class IHaveNatives {

    //abstract不可共用，abstract没有方法体
    public native void Native1(int x);

    public native static long Native2();

    private native synchronized float Native3(Object o);

    native void Native4(int[] ary) throws Exception;
}
