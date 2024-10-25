package com.smolop.design.patterns.factory.main;

import com.smolop.design.patterns.factory.interfaces.Class;

public class FactoryMain {

    private FactoryMain(){}

    public static void execute(){

        System.out.println("Start factory pattern.");

        Class classA = ClassFactory.getConcreteClass(ClassFactory.ClassType.CLASS_A);
        classA.methodA();
        classA.methodB();

        Class classB = ClassFactory.getConcreteClass(ClassFactory.ClassType.CLASS_B);
        classB.methodA();
        classB.methodB();

        Class classDefault = ClassFactory.getConcreteClass(ClassFactory.ClassType.CLASS_DEFAULT);
        classDefault.methodA();
        classDefault.methodB();

        System.out.println("Factory pattern finished.");

    }

}
