package com.smolop.design.patterns.strategy.main;

import com.smolop.design.patterns.strategy.main.Context;
import com.smolop.design.patterns.strategy.implementation.StrategyAImpl;
import com.smolop.design.patterns.strategy.implementation.StrategyBImpl;

public class StrategyPatternMain {

    private StrategyPatternMain(){}

    public static void execute(){
        System.out.println("Start strategy pattern.");

        Context context = new Context(new StrategyAImpl());

        System.out.println("Strategy A");
        context.executeStrategy();

        context.setStrategy(new StrategyBImpl());
        System.out.println("Strategy B");
        context.executeStrategy();

        System.out.println("Strategy pattern finished.");
    }

}
