module it.edu.calvino.java_gestionecamere {
    requires javafx.controls;
    requires javafx.fxml;


    opens it.edu.calvino.java_gestionecamere to javafx.fxml;
    exports it.edu.calvino.java_gestionecamere;
}