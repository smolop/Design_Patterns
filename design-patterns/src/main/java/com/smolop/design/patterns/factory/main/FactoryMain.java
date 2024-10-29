package com.smolop.design.patterns.factory.main;

import com.smolop.design.patterns.factory.interfaces.Class;

public class FactoryMain {

    private FactoryMain(){}

    public static void execute(){
        System.out.println("Start factory pattern.");

        System.out.println("Class A Factory");
        Class classA = ClassFactory.getConcreteClass(ClassFactory.ClassType.CLASS_A);
        classA.methodA();
        classA.methodB();

        System.out.println("Class B Factory");
        Class classB = ClassFactory.getConcreteClass(ClassFactory.ClassType.CLASS_B);
        classB.methodA();
        classB.methodB();

        System.out.println("Class Default Factory");
        Class classDefault = ClassFactory.getConcreteClass(ClassFactory.ClassType.CLASS_DEFAULT);
        classDefault.methodA();
        classDefault.methodB();

        System.out.println("Factory pattern finished.");
    }

}
