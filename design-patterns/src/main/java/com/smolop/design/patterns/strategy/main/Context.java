package com.smolop.design.patterns.strategy.main;

import com.smolop.design.patterns.strategy.interfaces.Strategy;

public class Context {

    private Strategy strategy;

    public Context (Strategy strategy){
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public void executeStrategy(){
        strategy.execute();
    }

}
