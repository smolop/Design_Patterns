package com.smolop.design.patterns.facade.implementation;

import com.smolop.design.patterns.facade.interfaces.SubSystemThree;

public class SubSystemThreeImpl implements SubSystemThree {
    @Override
    public void subSystemThreeMethodA() {
        System.out.printf("Starting subSystemThreeMethodA from %s%n", this.getClass().getName());
        subMethodA();
        subMethodB();
        subMethodC();
        System.out.println("subSystemThreeMethodA finished.");
    }

    private void subMethodA() {
        System.out.printf("subMethodA from %s%n", this.getClass().getName());
    }

    private void subMethodB() {
        System.out.printf("subMethodB from %s%n", this.getClass().getName());
    }

    private void subMethodC() {
        System.out.printf("subMethodC from %s%n", this.getClass().getName());
    }

}
