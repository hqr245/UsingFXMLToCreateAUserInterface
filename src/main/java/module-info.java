module es.ieslosmontecillos.usingfxmltocreateauserinterface {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.usingfxmltocreateauserinterface to javafx.fxml;
    exports es.ieslosmontecillos.usingfxmltocreateauserinterface;
}