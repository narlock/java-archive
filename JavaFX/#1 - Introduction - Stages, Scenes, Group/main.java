package com.narlock.fxtest;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Group root = new Group(); //Basic type of root node
        //Scene scene = new Scene(root, Color.BLACK); //add root node to scene
        Scene scene = new Scene(root, 500,500, Color.PURPLE);
        Text text = new Text();
            text.setText("Hello World");
            //Since we are using Group class, we will manually set X and Y
            text.setX(50);
            text.setY(50);
            text.setFont(Font.font("Tahoma",20)); //Set font of Text
            text.setFill(Color.GOLD); //Sets color of the Text

        //Sample line
        Line line = new Line();
            //Required
            line.setStartX(100);
            line.setStartY(100);
            line.setEndX(200);
            line.setEndY(100);

            //Other line methods
            line.setStrokeWidth(5); //width of line
            line.setStroke(Color.BLUE); //color of line
            line.setOpacity(0.5); //changes opacity of line
            //line.setRotate(45); //rotate the line by the argument in degrees

        //Rectangle
        Rectangle rectangle = new Rectangle();
            rectangle.setX(200); //location
            rectangle.setY(200);
            rectangle.setWidth(100); //size
            rectangle.setHeight(100);

            rectangle.setFill(Color.GREEN);
            rectangle.setStrokeWidth(5); //outline
            rectangle.setStroke(Color.BLACK);

        //Triangle
        Polygon triangle = new Polygon();
            triangle.getPoints().setAll(
                                    100.0, 100.0,
                                    300.0, 300.0,
                                    150.0, 300.0
                                        );
            triangle.setFill(Color.YELLOW);

        //Circle
        Circle circle = new Circle();
            circle.setCenterX(350);
            circle.setCenterY(350);
            circle.setRadius(20);

            circle.setFill(Color.RED);

        //Image
        Image pikaImage = new Image("file:pika.png");
        ImageView imageView = new ImageView(pikaImage);
        imageView.setX(400);
        imageView.setY(300);

        //We must add the components to the tree in the Group
        root.getChildren().add(text);
        root.getChildren().add(line);
        root.getChildren().add(rectangle);
        root.getChildren().add(triangle);
        root.getChildren().add(circle);
        root.getChildren().add(imageView);


        //Adds icon to Stage
        Image icon = new Image("file:icon.png");
        stage.getIcons().add(icon);

        /*
         * Stage Setup
         */
        //stage.setWidth(400);
        //stage.setHeight(400);
        stage.setResizable(false);
        //Can change where the stage window appears with setX or setY, but by default it is in the middle
        //stage.setFullScreen(true); //Full screens the window
        //stage.setFullScreenExitHint("some string"); //hint that says when exit
        //stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"); //changes how to exit fullscreen
        stage.setTitle("Java FX Test");
        stage.setScene(scene); //add scene to stage, setting the scene
        stage.show(); //Shows the stage
    }

    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir");
        System.out.println("Current dir using System:" + currentDir);

        launch();
    }
}