package com.sl.kotlindemo.proxy.javaproxy;

public class Derived implements Base{
    private final Base base;

    public Derived(Base base) {
        this.base = base;
    }

    @Override
    public void print() {
        base.print();
    }

    public static void main(String[] args) {
        Base b = new BaseImpl(10);
        Derived derived = new Derived(b);
        derived.print();
    }
}

