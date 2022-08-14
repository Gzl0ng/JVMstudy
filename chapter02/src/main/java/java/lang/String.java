package java.lang;

/**
 * @author 郭正龙
 * @date 2022-08-14
 */
public class String {
    static {
        System.out.println("我是自定义的String类的静态代码块");
    }

    //错误: 在类 java.lang.String 中找不到 main 方法, 请将 main 方法定义为:
    public static void main(String[] args) {
        System.out.println("hello,String");
    }
}
