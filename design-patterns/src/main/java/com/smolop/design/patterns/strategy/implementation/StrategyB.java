package com.smolop.design.patterns.strategy.implementation;

import com.smolop.design.patterns.strategy.interfaces.Strategy;

public abstract class StrategyB implements Strategy {

    @Override
    public void execute() {
        methodA();
        methodB();
        methodC();
        methodI();
        methodN();
    }

    abstract void methodA();

    abstract void methodB();

    abstract void methodC();

    abstract void methodI();

    abstract void methodN();

}
