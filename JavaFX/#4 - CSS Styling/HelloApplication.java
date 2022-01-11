package com.narlock.fxtest;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
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

        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

        /*If you have more than one scene, you may want
         *to reuse the css file, you can write the following
         * String css = this.getClass().getResource("application.css").toExternalForm()
         * and then just use this in each scene with a similar line to 27
         */

        //Adds icon to Stage
        Image icon = new Image("file:icon.png");
        stage.getIcons().add(icon);

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