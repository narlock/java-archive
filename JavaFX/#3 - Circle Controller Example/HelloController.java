package com.narlock.fxtest;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

public class HelloController {
    @FXML
    private Circle myCircle;
    private double x;
    private double y;

    public void up(ActionEvent e) {
        System.out.println("MOVE CIRCLE UP");
        myCircle.setCenterY(y-=10);
    }
    public void down(ActionEvent e) {
        System.out.println("MOVE CIRCLE DOWN");
        myCircle.setCenterY(y+=10);
    }
    public void left(ActionEvent e) {
        System.out.println("MOVE CIRCLE LEFT");
        myCircle.setCenterX(x-=10);
    }
    public void right(ActionEvent e) {
        System.out.println("MOVE CIRCLE RIGHT");
        myCircle.setCenterX(x+=10);
    }
}