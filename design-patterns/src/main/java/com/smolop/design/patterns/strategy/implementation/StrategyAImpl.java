package com.smolop.design.patterns.strategy.implementation;

import static java.lang.System.*;

public class StrategyAImpl extends StrategyA {

    @Override
    void methodA() {
        out.printf("Executing methodA from %s.%n", this.getClass().getName());
    }

    @Override
    void methodB() {
        out.printf("Executing methodB from %s.%n", this.getClass().getName());
    }

    @Override
    void methodC() {
        out.printf("Executing methodC from %s.%n", this.getClass().getName());
    }

}
