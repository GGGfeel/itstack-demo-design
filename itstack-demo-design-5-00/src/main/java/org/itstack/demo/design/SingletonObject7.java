package org.itstack.demo.design;

/**
 * @author shanke.jl
 * @Date: 2021/10/18 4:58 下午
 * 枚举类型是线程安全的，并且只会装载一次，设计者充分的利用了枚举的这个特性来实现单例模式，
 * 枚举的写法非常简单，而且枚举类型是所用单例实现中唯一一种不会被破坏的单例实现模式。
 */
public class SingletonObject7 {
    private SingletonObject7(){

    }

    /**
     * 枚举类型是线程安全的，并且只会装载一次
     */
    private enum Singleton{
        TEST,
        INSTANCE;

        private final SingletonObject7 instance;

        Singleton(){
            instance = new SingletonObject7();
        }

        private SingletonObject7 getInstance(){
            return instance;
        }
    }

    public static SingletonObject7 getInstance(){

        return Singleton.INSTANCE.getInstance();
    }


}
