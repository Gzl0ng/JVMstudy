package com.gzl0ng.java2;

/**
 * @author 郭正龙
 * @date 2022-08-21
 */

/**
 * 栈上分配测试
 *
 * -Xmx1G -Xms1G -XX:-DoEscapeAnalysis -XX:+PrintGCDetails
 *
 * 作了逃逸分析后时间由：80ms-5ms并且没有发生GC
 */
public class StackAllocation {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            alloc();
        }

        //查看执行时间
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为： " + (end-start) + "ms");
        //为了方便查看堆内存中对象格式，线程sleep
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void alloc() {
        User user = new User();//未方式逃逸
    }

    static class User{

    }
}
