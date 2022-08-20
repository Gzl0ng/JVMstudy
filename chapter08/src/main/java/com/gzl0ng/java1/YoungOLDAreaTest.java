package com.gzl0ng.java1;

/**
 * @author 郭正龙
 * @date 2022-08-20
 */

/**
 * 测试：大对虾直接进入老年代
 * -Xms60m -Xmx60m -XX:NewRatio=2 -XX:SurvivorRatio=8 -XX:+PrintGCDetails
 *
 * 伊甸区：16m 幸存者区：4m（各2m）  老年区：40m
 */
public class YoungOLDAreaTest {
    public static void main(String[] args) {
        byte[] buffer = new byte[1024 * 1024 * 20]; //20m
    }
}
