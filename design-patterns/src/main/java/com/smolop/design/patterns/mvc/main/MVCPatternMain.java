package com.smolop.design.patterns.mvc.main;

import com.smolop.design.patterns.mvc.implementation.DataControllerImpl;
import com.smolop.design.patterns.mvc.implementation.DataModelImpl;
import com.smolop.design.patterns.mvc.implementation.DataViewImpl;
import com.smolop.design.patterns.mvc.interfaces.DataController;
import com.smolop.design.patterns.mvc.interfaces.DataModel;
import com.smolop.design.patterns.mvc.interfaces.DataView;

public class MVCPatternMain {

    private MVCPatternMain(){}

    public static void execute() {
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("[Star MVC pattern]");

        DataModel model = getDataModel();
        DataView view = new DataViewImpl();

        DataController controller = new DataControllerImpl(model, view);

        controller.updateView();

        controller.setDataReference("REF0X000F");
        controller.updateView();

        System.out.println("---------------------------------");
        System.out.printf("For more examples see:%n" +
        "https://github.com/smolop/HADS-Project%n" +
        "https://github.com/smolop/opentrade%n");
        System.out.println("---------------------------------");

        System.out.println("[MVC pattern finished]");
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    private static DataModel getDataModel(){
        DataModel dataModel = new DataModelImpl();
        dataModel.setReference("REF0X0000");
        return dataModel;
    }

}
