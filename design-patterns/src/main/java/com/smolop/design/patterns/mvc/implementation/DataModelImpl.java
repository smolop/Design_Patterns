package com.smolop.design.patterns.mvc.implementation;

import com.smolop.design.patterns.mvc.interfaces.DataModel;

public class DataModelImpl implements DataModel {

    private String reference;

    @Override
    public String getReference() {
        return reference;
    }

    @Override
    public void setReference(String reference) {
        this.reference = reference;
    }

    @Override
    public String toString() {
        return "Data{" +
                "reference='" + reference + '\'' +
                '}';
    }
}
