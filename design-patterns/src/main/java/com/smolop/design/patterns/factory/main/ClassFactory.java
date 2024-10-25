package com.smolop.design.patterns.factory.main;

import com.smolop.design.patterns.factory.interfaces.Class;
import com.smolop.design.patterns.factory.implemaentation.ClassAFactory;
import com.smolop.design.patterns.factory.implemaentation.ClassBFactory;
import com.smolop.design.patterns.factory.implemaentation.ClassDefaultFactory;

public class ClassFactory {

    private ClassFactory() {}

    public enum ClassType {
        CLASS_DEFAULT,
        CLASS_A,
        CLASS_B
    }

    public static Class getConcreteClass(ClassType classType) {

        if(ClassType.CLASS_A.equals(classType))
            return new ClassAFactory().create();
        else if (ClassType.CLASS_B.equals(classType))
            return new ClassBFactory().create();

        return new ClassDefaultFactory().create();
    }

}
