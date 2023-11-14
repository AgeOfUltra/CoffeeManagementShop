module com.cofeshop.cms {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires jasperreports;
    requires javafx.graphics;

    opens com.cofeshop.cms to javafx.fxml;
    opens com.cofeshop.cms.datamodel to javafx.base;
    exports com.cofeshop.cms;
    exports com.cofeshop.cms.datamodel;
}