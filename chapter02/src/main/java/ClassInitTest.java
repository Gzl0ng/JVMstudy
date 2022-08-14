/**
 * @author 郭正龙
 * @date 2022-08-10
 */
/**
 * 初始化阶段就是执行构造器方法clinit的过程
 */
public class ClassInitTest {
//    bytecode viewer软件打开字节码文件的method文件夹下有init和main还有clinit方法
    private static int num = 1;

    static {
        num = 2;
        num = 20;
        System.out.println(num);
//        System.out.println(number);//报错：非法的前向引用   可前向赋值
    }

    private static int number = 10;  //linking之prepare阶段： number = 0 ---> inital：20-->10

    public static void main(String[] args) {
        System.out.println(num);//2
        System.out.println(number);//20
    }
}
