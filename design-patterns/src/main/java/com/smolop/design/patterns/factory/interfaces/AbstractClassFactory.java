package com.smolop.design.patterns.factory.interfaces;

public abstract class AbstractClassFactory {

    public Class create(){
        Class clazz = createClass();
        return clazz;
    }

    protected abstract Class createClass();
}
