module com.isi.sponsorship {
    requires javafx.controls;
    requires javafx.fxml;
    requires TrayNotification;
    requires java.sql;


    opens com.isi.sponsorship to javafx.fxml;
    exports com.isi.sponsorship;
    exports com.isi.sponsorship.Controller;
    opens com.isi.sponsorship.Controller to javafx.fxml;

}