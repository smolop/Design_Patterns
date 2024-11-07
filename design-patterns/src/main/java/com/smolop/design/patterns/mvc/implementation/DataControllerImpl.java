package com.smolop.design.patterns.mvc.implementation;

import com.smolop.design.patterns.mvc.interfaces.DataController;
import com.smolop.design.patterns.mvc.interfaces.DataModel;
import com.smolop.design.patterns.mvc.interfaces.DataView;

public class DataControllerImpl implements DataController {

    DataModel dataModel;
    DataView dataView;

    public DataControllerImpl(DataModel dataModel, DataView dataView) {
        this.dataModel = dataModel;
        this.dataView = dataView;
    }

    @Override
    public String getDataReference() {
        return dataModel.getReference();
    }

    @Override
    public void setDataReference(String dataReference) {
        dataModel.setReference(dataReference);
    }

    @Override
    public void updateView() {
        dataView.showData(dataModel);
    }
}
