module Project {
	requires javafx.controls;
	requires com.jfoenix;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;
	requires java.desktop;
	requires java.sql;
	opens application to javafx.graphics, javafx.fxml;
	exports application;
}
