package com.smolop.design.patterns.strategy.implementation;

public class StrategyBImpl extends StrategyB {

    @Override
    void methodA() {
        System.out.printf("Executing methodA from %s.%n", this.getClass().getName());
    }

    @Override
    void methodB() {
        System.out.printf("Executing methodB from %s.%n", this.getClass().getName());
    }

    @Override
    void methodC() {
        System.out.printf("Executing methodC from %s.%n", this.getClass().getName());
    }

    @Override
    void methodI() {
        System.out.printf("Executing methodI from %s.%n", this.getClass().getName());
    }

    @Override
    void methodN() {
        System.out.printf("Executing methodN from %s.%n", this.getClass().getName());
    }

}
