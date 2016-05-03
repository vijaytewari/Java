package com.cs501.listing;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.control.Button;
import javafx.scene.layout.*;

public class ButtonInPane extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		StackPane pane = new StackPane();
		pane.getChildren().add(new Button("OK"));
	}
	
}
