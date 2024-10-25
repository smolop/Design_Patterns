package com.smolop.design.patterns.factory.implemaentation;

import com.smolop.design.patterns.factory.interfaces.Class;

public class ClassDefault implements Class {
    @Override
    public void methodA() {
        System.out.printf("methodA from %s%n", this.getClass().getName());
    }

    @Override
    public void methodB() {
        System.out.printf("methodB from %s%n", this.getClass().getName());
    }

}
