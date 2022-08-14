package java.lang;

/**
 * @author 郭正龙
 * @date 2022-08-14
 */
public class gzlStart {
    public static void main(String[] args) {

        //扫描到是java.lang包下的，但是这个包下不含gzlStart类，处于对于引导类加载器的保护就会报错
        //java.lang.SecurityException: Prohibited package name: java.lang
        System.out.println("hello");
    }
}
