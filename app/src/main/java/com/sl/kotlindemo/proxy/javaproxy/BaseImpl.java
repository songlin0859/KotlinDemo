package com.sl.kotlindemo.proxy.javaproxy;

public class BaseImpl implements Base {
    private final int x;

    public BaseImpl(int x) {
        this.x = x;
    }

    @Override
    public void print() {
        System.out.println("x ="+x);
    }
}
