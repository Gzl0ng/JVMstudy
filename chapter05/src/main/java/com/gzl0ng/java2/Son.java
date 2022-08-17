package com.gzl0ng.java2;

/**
 * @author 郭正龙
 * @date 2022-08-17
 */

//解析调用非虚方法，虚方法的测试
//非虚方法，编译器确定的(invokestatic,invokespecial)
class Father {
    public Father() {
        System.out.println("father的构造器");
    }


    public static void showStatic(String str) {
        System.out.println("father " + str);
    }

    public final void showFinal() {
        System.out.println("father show final");
    }

    public void showCommon() {
        System.out.println("father 普通方法");
    }
}

public class Son extends Father{
        public Son(){
            //invokespecial
            super();
        }

        public Son(int age){
            //invokespecial
            this();
        }

        //不是重写的父类的静态方法，以静态方法不能被重写
        public static void showStatic(String str){
            System.out.println("son " + str);
        }

        public void showPrivate(String str){
            System.out.println("son private " + str);
        }

        public void show(){
            //非虚方法，编译器确定的(invokestatic,invokespecial)
            //invokestatic
            showStatic("gzl0ng.com");
            //invokestatic
            super.showStatic("good!");
            //invokespecial
            showPrivate("hello!");
            //invokespecial
            super.showCommon();

            //虚方法
            //invokevirtual(实际还是虚方法，因为父类的为final修饰不能被重写，如果加super调用就会变成invokespecial)
            showFinal();
            //invokevirtual
            showCommon();
            info();

            MethodInterface in = null;
            //invokeinterface
            in.methodA();
        }

        public void info(){

        }

        public void display(Father f){
            f.showCommon();
        }

    public static void main(String[] args) {
        Son son = new Son();
        son.show();
    }
}

interface MethodInterface{
    void methodA();
}
