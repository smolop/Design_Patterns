package com.smolop.design.patterns.mvc.implementation;

import com.smolop.design.patterns.mvc.interfaces.DataModel;
import com.smolop.design.patterns.mvc.interfaces.DataView;

public class DataViewImpl implements DataView {

    @Override
    public void showData(DataModel data) {
        System.out.println(data.toString());
    }

}
