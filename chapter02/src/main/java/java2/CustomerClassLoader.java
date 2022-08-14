package java2;

import java.io.FileNotFoundException;

/**
 * @author 郭正龙
 * @date 2022-08-14
 */

//如果不需要从不同数据源读取字节码文件或加密解密操作等辅助操作，
// 直接继承URLClassLoader类，可以避免写findClass方法及其获取字节码流的方式，使自定义类加载器编写更简单
public class CustomerClassLoader extends ClassLoader{

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {

        try {
            byte[] result = getClassFromCustomePath(name);
            if (result == null){
                throw new FileNotFoundException();
            }else {
                return defineClass(name,result,0,result.length);
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        return null;
    }

    private byte[] getClassFromCustomePath(String name) {
        //从值路径中加载指定类：细节略
        //如果指定路径的字节码文件进行了加密，则需要在此方法中进行解密操作
        return null;
    }

    public static void main(String[] args) {

        CustomerClassLoader customerClassLoader = new CustomerClassLoader();
        try {
            Class<?> clazz = Class.forName("One", true, customerClassLoader);
            Object obj = clazz.newInstance();
            System.out.println(obj.getClass().getClassLoader());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
