package com.gzl0ng.java2;

/**
 * @author 郭正龙
 * @date 2022-08-21
 */

/**
 * -Xms100m -Xmx100m -XX:+DoEscapeAnalysis -XX:+PrintGC -XX:-EliminateAllocations
 * 标量替换测试
 *
 * 开启后由100ms变为4ms  而且没有发生GC
 */
public class ScalarReplace {

    public static class User{
        public int it;
        public String name;
    }

    public static void alloc(){
        User user = new User();//未发生逃逸
        user.it = 5;
        user.name = "gzl0ng";
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            alloc();
        }
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为： " + (end-start) + "ms");
    }
}


/*
class Customer{
  String name;
  int id;
  Account acct;
}

下面就为标量
class Account{
    double balance;
}
 */