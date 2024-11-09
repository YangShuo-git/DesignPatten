package com.example.designpattern.singleton.ehan;

/**
 * 单例模式的饿汉式[可用]
 * (1)构造函数私有化
 * (2)在本类中new一个静态本类对象
 * (3)定义一个公有的方法，返回在该类中所创建的对象
 * 优点：在类加载的时候就完成了实例化，避免了线程的同步问题
 * 缺点：由于在类加载的时候就实例化了，所以没有达到Lazy Loading(懒加载)的效果，也就是说可能没有用到这个实例，但是它
 * 也会实例，会造成内存的浪费(但是这个浪费可以忽略，所以这种方式也是推荐使用的)
 */

public class SingletonEHan {
    private SingletonEHan() {}
    /**
     * 1.单例模式的饿汉式[可用]
     */
    // 在类加载的时候就完成实例化，因此无论何时调用getInstance()方法，都会返回同一个实例，不会存在线程安全的问题
    private static SingletonEHan singletonEHan = new SingletonEHan();

    public static SingletonEHan getInstance() {
        return singletonEHan;
    }
//     SingletonEHan instance= SingletonEHan.getInstance();

    /**
     * 2. 单例模式的饿汉式变换写法[可用]
     * 基本没区别
     */
    private static SingletonEHan singletonEHanTwo = null;

    static {
        singletonEHanTwo = new SingletonEHan();
    }

    public static SingletonEHan getSingletonEHan() {
        if (singletonEHanTwo == null) {
            singletonEHanTwo = new SingletonEHan();
        }
        return singletonEHanTwo;
    }
    //     SingletonEHan instance= SingletonEHan.getSingletonEHan();
}
