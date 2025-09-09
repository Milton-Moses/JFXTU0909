module farmingdale.jfxtu0909 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens farmingdale.jfxtu0909 to javafx.fxml;
    exports farmingdale.jfxtu0909;
}