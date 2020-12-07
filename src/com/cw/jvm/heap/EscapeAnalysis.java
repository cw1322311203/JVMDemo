package com.cw.jvm.heap;

/**
 * 逃逸分析
 * <p>
 * 如何快速的判断是否发生了逃逸分析,就看new的对象实体是否有可能在方法外被调用
 */
public class EscapeAnalysis {

    public EscapeAnalysis obj;

    /**
     * 方法返回EscapeAnalysis对象,发生逃逸
     *
     * @return
     */
    public EscapeAnalysis getInstance() {
        return obj == null ? new EscapeAnalysis() : obj;
    }

    /**
     * 为成员属性赋值,发生逃逸
     */
    public void setObj() {
        this.obj = new EscapeAnalysis();
    }
    // 思考:如果当前的obj引用声明为static的,是否会发生逃逸?仍然会发生逃逸

    /**
     * 对象的作用域仅在当前方法中有效,没有发生逃逸
     */
    public void useEscapeAnalysis() {
        EscapeAnalysis e = new EscapeAnalysis();
    }

    /**
     * 引用成员变量的值,发生逃逸
     */
    public void useEscapeAnalysis1() {
        EscapeAnalysis e = getInstance();
        //getInstance().xxx() 同样会发生逃逸
    }

}
