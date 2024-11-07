package com.smolop.design.patterns.facade.main;

import com.smolop.design.patterns.facade.interfaces.Facade;

public class FacadePatternMain {

    private FacadePatternMain() {}

    public static void execute(){
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("[Start facade pattern]");

        Facade facade = new FacadeImpl();
        facade.complexMethod();

        System.out.println("[Facade pattern finished]");
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
