package com.gzl0ng.java;

/**
 * @author 郭正龙
 * @date 2022-08-20
 */

/**
 * 1.设置堆空间大小的参数
 * -Xms 用来设置堆空间（年轻代+老年代）的初始内存大小
 *      -X 是jvm的运行参数
 *      ms 是memory start
 *
 * -Xmx 用来设置堆空间（年轻代+老年代）的最大内存大小
 *
 * 2.默认堆空间大小：最小空间为物理内存的64分之1，最大空间为物理内存的4分之1
 * 3.手动设置：-Xms600m -Xmx600m
 *      开发中建议将初始堆内存和最大堆内存设置成相同的值。
 * 4.查看设置的参数：方式一：jps查看进程 jstat -gc 进程id
 *      方式二(执行完才打印)：-XX:+PrintGCDetails
 */
public class HeapSpaceInitial {
    public static void main(String[] args) {
        //返回java虚拟机中的堆内存总量
        long totalMemory = Runtime.getRuntime().totalMemory()/1024/1024;
        //返回java虚拟机下图使用的最大堆内存使用量
        long maxMemory = Runtime.getRuntime().maxMemory()/1024/1024;

        System.out.println("-Xms : " + totalMemory + "M");
        System.out.println("-Xmx : " + maxMemory + "M");

        //jsp查看应用进程，jstat -gc pid查看进程的gc信息
        //S0C S1C EC OC  幸存者0区，幸存者1区，伊甸区，老年区
        //计算结果小于设置的原因：垃圾复制回收算法，幸存者0区和幸存者1区只有一个能放对象
//        System.out.println("系统内存大小为： " + totalMemory*64.0/1024 + "G");
//        System.out.println("系统内存大小为： " + maxMemory*4.0/1024 + "G");

//        try {
//            Thread.sleep(1000000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
