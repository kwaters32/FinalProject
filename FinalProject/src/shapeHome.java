import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import java.io.*;
import java.util.*;
import javafx.geometry.Pos;
import javafx.geometry.HPos;



public class shapeHome extends Application {
    private TextField shape = new TextField();
    private TextField side = new TextField();
    private TextField height = new TextField();
    private TextField apothem = new TextField();
    private TextField answer = new TextField();
    private Button btCalculate = new Button("Calculate");
    
    private TextField shapeP = new TextField();
    private TextField sideP = new TextField();
    private TextField sideP2 = new TextField();
    private TextField sideP3 = new TextField();
    private TextField answer2 = new TextField();
    private Button btCalculate2 = new Button("Calculate");

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) 
    {
        // Create UI
        GridPane gridPane = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.add(new Label("If you don't need to enter a value for cetain shapes, just enter 0."), 0, 0);
        gridPane.add(new Label("Enter Shape you would like to calculate Area of:"), 0, 1);
        gridPane.add(shape, 1, 1);
        gridPane.add(new Label("Length of Side:"), 0, 2);
        gridPane.add(side, 1, 2);
        gridPane.add(new Label("Length of Height:"), 0, 3);
        gridPane.add(height, 1, 3);
        gridPane.add(new Label("Length of Apothem:"), 0, 4);
        gridPane.add(apothem, 1, 4);
        gridPane.add(new Label("Answer:"), 0, 5);
        gridPane.add(answer, 1, 5);
        gridPane.add(btCalculate, 1, 6);
        
        gridPane.add(new Label("Enter Shape you would like to calculate Perimeter of:"), 0, 9);
        gridPane.add(shapeP, 1, 9);
        gridPane.add(new Label("Length of Side:"), 0, 10);
        gridPane.add(sideP, 1, 10);
        gridPane.add(new Label("Length of Side 2:"), 0, 11);
        gridPane.add(sideP2, 1, 11);
        gridPane.add(new Label("Length of Side 3:"), 0, 12);
        gridPane.add(sideP3, 1, 12);
        gridPane.add(new Label("Answer:"), 0, 13);
        gridPane.add(answer2, 1, 13);
        gridPane.add(btCalculate2, 1, 15);


        // Set properties for UI
        gridPane.setAlignment(Pos.CENTER);
        height.setAlignment(Pos.BOTTOM_RIGHT);
        side.setAlignment(Pos.BOTTOM_RIGHT);
        shape.setAlignment(Pos.BOTTOM_RIGHT);
        apothem.setAlignment(Pos.BOTTOM_RIGHT);
        answer.setAlignment(Pos.BOTTOM_RIGHT);
        answer.setEditable(false);
        
        shapeP.setAlignment(Pos.BOTTOM_RIGHT);
        sideP.setAlignment(Pos.BOTTOM_RIGHT);
        sideP2.setAlignment(Pos.BOTTOM_RIGHT);
        sideP3.setAlignment(Pos.BOTTOM_RIGHT);
        answer2.setAlignment(Pos.BOTTOM_RIGHT);
        GridPane.setHalignment(btCalculate, HPos.RIGHT);
        GridPane.setHalignment(btCalculate2, HPos.RIGHT);

        // Process events
        btCalculate.setOnAction(e -> calculateArea());
        btCalculate2.setOnAction(e -> calculatePerimeter());

        // Create a scene and place it in the stage
        Scene scene = new Scene(gridPane, 500, 600);
        primaryStage.setTitle("Perimeter and Area Calculator"); 
        primaryStage.setScene(scene); 
        primaryStage.show(); 
    }
    
    //Calculate the Area depending on what shape is entered 
    private void calculateArea() {
        // Get values from text fields
        String shapeShape = shape.getText();
    	double shapeHeight = Double.parseDouble(height.getText());
        double shapeSide = Double.parseDouble(side.getText());                
        double shapeApothem = Double.parseDouble(apothem.getText());
        
        if(shapeShape.equals("Triangle"))
        {        	
        	double shapeArea = (shapeHeight * shapeSide) * (.5);
            answer.setText(String.format("%.2f", shapeArea));
        }
        else if(shapeShape.equals("Square"))
        {
        	double shapeArea = (shapeSide * shapeSide);
        	answer.setText(String.format("%.2f", shapeArea));
        }
        else if(shapeShape.equals("Pentagon"))
        {
        	double shapeArea = (shapeSide * shapeApothem) * (5/2);
        	answer.setText(String.format("%.2f", shapeArea));
        }
        else if(shapeShape.equals("Hexagon"))
        {
        	double shapeArea = (((Math.sqrt(3) * 3) * (Math.pow(shapeSide, 2))) / 2);
        	answer.setText(String.format("%.2f", shapeArea));
        }
        else if(shapeShape.equals("Heptagon"))
        {
        	double shapeArea = ((.5) * (7) * (shapeSide) * (shapeApothem));
        	answer.setText(String.format("%.2f", shapeArea));
        }
    }  
    
    //Calculate Perimeter depending on what shape is entered.
    private void calculatePerimeter() {
        // Get values from text fields
        String shapeShape = shapeP.getText();
    	double shapeSide = Double.parseDouble(sideP.getText());
        double shapeSide2 = Double.parseDouble(sideP2.getText());                
        double shapeSide3 = Double.parseDouble(sideP3.getText());
        
        if(shapeShape.equals("Triangle"))
        {        	
        	double shapePerimeter = (shapeSide + shapeSide2 + shapeSide3);
            answer2.setText(String.format("%.2f", shapePerimeter));
        }
        else if(shapeShape.equals("Square"))
        {
        	double shapePerimeter = (shapeSide * 4);
        	answer2.setText(String.format("%.2f", shapePerimeter));
        }
        else if(shapeShape.equals("Pentagon"))
        {
        	double shapePerimeter = (shapeSide * 5);
        	answer2.setText(String.format("%.2f", shapePerimeter));
        }
        else if(shapeShape.equals("Hexagon"))
        {
        	double shapePerimeter = (shapeSide * 6);
        	answer2.setText(String.format("%.2f", shapePerimeter));
        }
        else if(shapeShape.equals("Heptagon"))
        {
        	double shapePerimeter = (shapeSide * 6);
        	answer2.setText(String.format("%.2f", shapePerimeter));
        }
    }         
    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     */
    public static void main(String[] args)
    {
        launch(args);
    }
}