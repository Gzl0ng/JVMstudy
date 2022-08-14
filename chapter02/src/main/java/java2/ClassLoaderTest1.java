package java2;

import sun.misc.Launcher;
import sun.security.ec.CurveDB;

import java.net.URL;
import java.security.Provider;
import java.util.Properties;

/**
 * @author 郭正龙
 * @date 2022-08-14
 */
public class ClassLoaderTest1 {
    public static void main(String[] args) {
        System.out.println("*********启动类加载器**********");
        //获取BootstrapClassLoader能够加载的api路径
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        for (URL urL : urLs) {
            System.out.println(urL.toExternalForm());
        }

        //从上面的路径中随意选择一个类，来看他的类加载器是什么:引导类加载器
        ClassLoader classLoader = Provider.class.getClassLoader();
        System.out.println(classLoader);

        System.out.println("***********扩展类加载器*********");
        String property = System.getProperty("java.ext.dirs");
        for (String path : property.split(";")){
            System.out.println(path);
        }

        //从上面的路径中随意选择一个类，来看他的类加载器是什么:扩展类类加载器
        ClassLoader classLoader1 = CurveDB.class.getClassLoader();
        System.out.println(classLoader1);
    }
}
