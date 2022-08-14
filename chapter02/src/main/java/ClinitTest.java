/**
 * @author 郭正龙
 * @date 2022-08-14
 */
public class ClinitTest {
    //任何一个类声明以后，内部至少存在一个类的构造器   字节码的method文件夹init文件
    private int a = 1;

    private static int c= 3;//变量的重新赋值或静态的赋值字节码才会有clinit方法

    public static void main(String[] args) {
        int b = 2;
    }

    public ClinitTest(){
        a = 10;
        int d = 20;
    }
}
