package com.gzl0ng.java;

/**
 * @author 郭正龙
 * @date 2022-08-20
 */

/**
 * -Xms10m -Xmx10m
 */
public class HeapDemo1 {
    public static void main(String[] args) {
        System.out.println("start...");

        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("end...");
    }
}
