package com.gzl0ng.java2;

/**
 * @author 郭正龙
 * @date 2022-08-21
 */

/**
 * 逃逸分析
 *
 *      如何快速的判断是否发生了逃逸分析，就看new的对象实体是否有可能在方法外被调用
 */
public class EscapeAnalysis {

    public EscapeAnalysis obj;

    /*
    方法返回EscapeAnalysis对象，发生逃逸
     */
    public EscapeAnalysis getInstance(){
        return obj == null ? new EscapeAnalysis() : obj;
    }

    /*
    为成员属性赋值，发生逃逸
     */
    public void setObj(){
        this.obj = new EscapeAnalysis();
    }

    //思考：如果当前的obj引用声明为static?仍然发发生逃逸.

    /*
    对象的作用域仅在当前方法中有效，没有发送逃逸
     */
    public void useEscapeAnalysis(){
        EscapeAnalysis e = new EscapeAnalysis();
    }

    /*
    引用成员变量的值，方式逃逸
     */
    public void useEscapeAnalysis1(){
        EscapeAnalysis e = getInstance();
        //getInstance（）.xxx同样会发生逃逸
    }
}
