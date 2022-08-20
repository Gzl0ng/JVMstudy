package com.gzl0ng.java;

/**
 * @author 郭正龙
 * @date 2022-08-20
 */

/**
 * 方法调用结束不会被GC立马回收，因为如果一个方法被频繁调用导致GC频繁，
 * 会影响用户线程执行
 */
public class SimpleHeap {
    private int id;

    public SimpleHeap(int id){
        this.id = id;
    }

    public void show(){
        System.out.println("My ID is " + id);
    }

    public static void main(String[] args) {
        SimpleHeap s1 = new SimpleHeap(1);
        SimpleHeap s2 = new SimpleHeap(2);

        int[] arr = new int[10];

        Object[] arr1 = new Object[10];
    }
}
