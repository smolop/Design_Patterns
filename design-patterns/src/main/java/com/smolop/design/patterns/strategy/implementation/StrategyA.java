package com.smolop.design.patterns.strategy.implementation;

import com.smolop.design.patterns.strategy.interfaces.Strategy;

public abstract class StrategyA implements Strategy {

    @Override
    public void execute() {
        methodA();
        methodB();
        methodC();
    }

    abstract void methodA();

    abstract void methodB();

    abstract void methodC();

}
