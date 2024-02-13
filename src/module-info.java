module JStressFx {
	requires javafx.base;
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	requires waffle.jna;
	
	opens application to javafx.base, javafx.graphics, javafx.fxml;
//	opens application.Controller to javafx.fxml;
//	opens application.DTO to javafx.base;
}
