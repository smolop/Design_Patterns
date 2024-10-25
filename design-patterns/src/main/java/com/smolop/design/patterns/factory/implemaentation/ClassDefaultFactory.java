package com.smolop.design.patterns.factory.implemaentation;

import com.smolop.design.patterns.factory.interfaces.AbstractClassFactory;
import com.smolop.design.patterns.factory.interfaces.Class;

public class ClassDefaultFactory extends AbstractClassFactory {
    @Override
    protected Class createClass() {
        return new ClassDefault();
    }

}