/**
 * @author 郭正龙
 * @date 2022-08-14
 */

//双亲委派模型
public class StringTest {
    public static void main(String[] args) {
        //委派到引导类加载器发现有这个包，就由引导类加载器去加载了
        String str = new java.lang.String();
        System.out.println("hello gzl0ng.com");

        //依次往上委托，引导类扩展类都有各自对应的扫描路径，发现不归自己管，所以就由系统类加载器去加载
        StringTest test = new StringTest();
        System.out.println(test.getClass().getClassLoader());
    }
}
