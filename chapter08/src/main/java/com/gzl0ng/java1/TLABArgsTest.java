package com.gzl0ng.java1;

/**
 * @author 郭正龙
 * @date 2022-08-20
 */

/**
 * 测试-XX:UseTLAB参数是否开启:默认开启
 *
 * 检查：jps
 *  jinfo -flag UseTLAB pid
 */
public class TLABArgsTest {
    public static void main(String[] args) {
        System.out.println("鸡汤来咯。。。。");

        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
