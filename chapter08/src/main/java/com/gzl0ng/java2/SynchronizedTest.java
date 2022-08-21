package com.gzl0ng.java2;

/**
 * @author 郭正龙
 * @date 2022-08-21
 */

/**
 * 同步省略说明
 *
 * 加载到内存才进行判断进行同步省略，在字节码中还是有synchronized
 * monitorenter  monitorexit二个字节码就是synchronized的作用范围
 */
public class SynchronizedTest {
    public void f(){
        Object hollis = new Object();
        synchronized (hollis){
            System.out.println(hollis);
        }
    }
}
