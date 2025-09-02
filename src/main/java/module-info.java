module pe.edu.tecsup.lab03.cps_lab03 {
    requires javafx.controls;
    requires javafx.fxml;


    opens pe.edu.tecsup.lab03.cps_lab03 to javafx.fxml;
    exports pe.edu.tecsup.lab03.cps_lab03;
}