package com.gzl0ng.java3;

/**
 * @author 郭正龙
 * @date 2022-08-18
 */
//虚方法的举例
    interface Friendly{
        void sayHello();
        void sayGoodbye();
}
class Dog{
        public void sayHello(){

        }

        @Override
        public String toString(){
            return "Dog";
        }
}
class Cat implements Friendly{

    @Override
    public void sayHello() {

    }

    @Override
    public void sayGoodbye() {

    }
    public void eat(){

    }
    @Override
    public void finalize(){

    }

    @Override
    public String toString() {
        return "Cat";
    }
}
class CockerSpaniel extends Dog implements Friendly{
    @Override
    public void sayHello() {
        super.sayHello();
    }

    @Override
    public void sayGoodbye() {

    }
}
public class VirtualMethodTable {

}
