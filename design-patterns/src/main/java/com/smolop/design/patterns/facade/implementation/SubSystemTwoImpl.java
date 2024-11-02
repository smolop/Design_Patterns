package com.smolop.design.patterns.facade.implementation;

import com.smolop.design.patterns.facade.interfaces.SubSystemTwo;

public class SubSystemTwoImpl implements SubSystemTwo {
    @Override
    public void subSystemTwoMethodA() {
        System.out.printf("Starting subSystemTwoMethodA from %s%n", this.getClass().getName());
        subMethodA1();
        subMethodA2();
        System.out.println("subSystemTwoMethodA finished.");
    }

    private void subMethodA1() {
        System.out.printf("subMethodA1 from %s%n", this.getClass().getName());
    }

    private void subMethodA2() {
        System.out.printf("subMethodA2 from %s%n", this.getClass().getName());
    }

    @Override
    public void subSystemTwoMethodB() {
        System.out.printf("Starting subSystemTwoMethodB from %s%n", this.getClass().getName());
        subMethodB1();
        subMethodB2();
        System.out.println("subSystemTwoMethodB finished.");
    }

    private void subMethodB1() {
        System.out.printf("subMethodB1 from %s%n", this.getClass().getName());
    }

    private void subMethodB2() {
        System.out.printf("subMethodB2 from %s%n", this.getClass().getName());
    }

}
