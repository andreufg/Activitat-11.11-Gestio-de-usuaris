module es.progcipfpbatoi {
    requires javafx.controls;
    requires javafx.fxml;
    opens es.progcipfpbatoi.controladores to javafx.fxml;

    opens es.progcipfpbatoi to javafx.fxml;
    exports es.progcipfpbatoi;
}
