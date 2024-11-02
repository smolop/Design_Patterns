package com.smolop.design.patterns.facade.implementation;

import com.smolop.design.patterns.facade.interfaces.SubSystemOne;

public class SubSystemOneImpl implements SubSystemOne {
    @Override
    public void subSystemOneMethodA() {
        System.out.printf("Starting subSystemOneMethodA from %s%n", this.getClass().getName());
        subMethodA();
        subMethodB();
        System.out.println("subSystemOneMethodA finished");
    }

    private void subMethodA() {
        System.out.printf("subMethodA from %s%n", this.getClass().getName());
    }

    private void subMethodB() {
        System.out.printf("subMethodB from %s%n", this.getClass().getName());
    }

}
