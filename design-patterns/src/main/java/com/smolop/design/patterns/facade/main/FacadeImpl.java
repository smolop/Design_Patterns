package com.smolop.design.patterns.facade.main;

import com.smolop.design.patterns.facade.implementation.SubSystemOneImpl;
import com.smolop.design.patterns.facade.implementation.SubSystemThreeImpl;
import com.smolop.design.patterns.facade.implementation.SubSystemTwoImpl;
import com.smolop.design.patterns.facade.interfaces.Facade;
import com.smolop.design.patterns.facade.interfaces.SubSystemOne;
import com.smolop.design.patterns.facade.interfaces.SubSystemThree;
import com.smolop.design.patterns.facade.interfaces.SubSystemTwo;

public class FacadeImpl implements Facade {

    SubSystemOne subSystemOne;
    SubSystemTwo subSystemTwo;

    SubSystemThree subSystemThree;

    public FacadeImpl() {
        this.subSystemOne = new SubSystemOneImpl();
        this.subSystemTwo = new SubSystemTwoImpl();
        this.subSystemThree = new SubSystemThreeImpl();
    }

    @Override
    public void complexMethod() {
        subSystemOne.subSystemOneMethodA();
        subSystemTwo.subSystemTwoMethodA();
        subSystemTwo.subSystemTwoMethodB();
        subSystemThree.subSystemThreeMethodA();
    }

}
