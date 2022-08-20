package com.gzl0ng.java;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author 郭正龙
 * @date 2022-08-20
 */

/**
 * -Xms600m -Xmx600m
 *
 * jvisualvm工具的visualGc看到新生区一直在加，抽样器看到原因是byte数组在加
 */
public class OOMTest {

    public static void main(String[] args) {
        ArrayList<Picture> list = new ArrayList<>();

        while (true){
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.add(new Picture(new Random().nextInt(1024*1024)));
        }
    }
}

class Picture{
    private byte[] pixels;

    public Picture(int length){
        this.pixels = new byte[length];
    }
}
