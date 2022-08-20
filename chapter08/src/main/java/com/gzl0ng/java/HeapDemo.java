package com.gzl0ng.java;

/**
 * @author 郭正龙
 * @date 2022-08-20
 */

/**
 * -Xms10m -Xmx10m
 *
 * 操作步骤：先在工具栏build下Recompile，然后在Run下edit Configurations下添加Vm option
 *
 * 运行demo程序，在jdk的bin目录下双击jvisualvm.exe，选择对应进程进行查看
 */
public class HeapDemo {
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
