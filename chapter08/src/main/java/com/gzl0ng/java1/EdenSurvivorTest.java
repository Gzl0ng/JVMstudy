package com.gzl0ng.java1;

/**
 * @author 郭正龙
 * @date 2022-08-20
 */

/**
 * -Xms600m -Xmx600m
 *
 * -XX:NewRatio=2    设置新时代与老年代比例。默认值是1:2
 * -XX:SurvivorRatio=8   设置新生代中Eden去与Survivor区的比例
 * -XX:-UseAdaptiveSizePolicy
 * -Xmn:设置新时代的空间大小   以这个为准（在比例和显示设置都有情况下）
 *
 * 减号是关闭内存的自适应策略（伊甸区和幸存者区比例默认是8比1比1，因为这个参数变成6比1比1）
 *      关闭没有用，要显示的去指定，
 * -XX:-UseAdaptiveSizePolicy
 */
public class EdenSurvivorTest {
    public static void main(String[] args) {
        System.out.println("鸡汤来咯。。。");

        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
