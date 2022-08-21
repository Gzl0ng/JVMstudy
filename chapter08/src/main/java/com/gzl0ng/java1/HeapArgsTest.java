package com.gzl0ng.java1;

/**
 * @author 郭正龙
 * @date 2022-08-21
 */

/**
 * 测试堆空间常用的jvm参数：
 * -XX:+PrintFlagsInitial:查看所有的参数的默认初始值
 * -XX:+PrintFlagsFinal:查看所有的参数的最终值（可能会修改，不再是初始值，比如智适应情况）
 *          具体查看某个参数的指令：jps:查看当前运行的进程id
 *                               jinfo -flag SurvivorRatio 进程id
 *
 * -Xms:初始堆空间内存（默认物理内存的1/64）
 * -Xmx:最大对内存空间（默认物理内存的1/4）
 * -Xmn:设置新生代的大小。（初始值及最大值）
 * -XX:NewRatio:配置新生代与老年代在堆结构比例
 * -XX:SurvivorRatio:设置新生代中Eden和S0/S1空间的比例
 * -XX:MaxTenuringThreshold:设置新生代垃圾的最大年龄
 * -XX:+PrintGCDetails:输出详细的GC处理日志
 * 打印gc简要详细： -XX:+PrintGC   -verbose:gc
 * -XX:HandlePromotionFailure:是否设置空间分配担保
 */
public class HeapArgsTest {
    public static void main(String[] args) {

    }
}
