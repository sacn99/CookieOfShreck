package ui;

import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.fxml.FXML;
import javafx.geometry.Pos;

public class SmileyFaceController {
		@FXML
    	private Pane pane;
	    @FXML
	    void createSmileyFace(MouseEvent event) {
	    	Circle circle = new Circle(event.getX(), event.getY(), event.getZ());
	    	Circle eye1 = new Circle(event.getX()+10, event.getY()+10, event.getZ());
	    	eye1.setFill(Color.WHITE);
	    	Circle eye2 = new Circle(event.getX()-10, event.getY()-10, event.getZ());
	    	eye2.setFill(Color.WHITE);
	    	eye1.setRadius(10);
	    	eye2.setRadius(10);
	    	circle.setRadius(50);
	    	circle.setFill(Color.BURLYWOOD);
	    	Arc smile= new Arc(event.getX()-30, event.getY()+30, 23, 23, 10, 90);
	    	Arc ceja1= new Arc(event.getX()-15, event.getY()-15, 23, 23, 10, 90);
	    	Arc ceja2= new Arc(event.getX()+15, event.getY()+15, 23, 23, 10, 90);
	    	ceja1.setFill(Color.LIGHTBLUE);
	    	ceja2.setFill(Color.LIGHTBLUE);
	    	smile.setFill(Color.RED);
	    	pane.getChildren().add(circle);
	    	pane.getChildren().add(eye1);
	    	pane.getChildren().add(eye2);
	    	pane.getChildren().add(smile);
	    	pane.getChildren().add(ceja1);
	    	pane.getChildren().add(ceja2);
	    }
}
