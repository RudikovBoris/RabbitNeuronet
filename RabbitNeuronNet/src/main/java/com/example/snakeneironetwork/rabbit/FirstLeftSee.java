package com.example.snakeneironetwork.rabbit;

import javafx.geometry.Bounds;
import javafx.scene.Parent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import static com.example.snakeneironetwork.Controller.*;
import static com.example.snakeneironetwork.Controller.directionRight;

public class FirstLeftSee extends Parent {
    Direction direction;

    Rectangle firstLine_Left = new Rectangle(30, 30, Color.YELLOW);

    public FirstLeftSee(int x, int y, Direction direction) {
        this.direction = direction;
        getChildren().add(firstLine_Left);

        switch (direction) {
            case DOWN:
                x += 30;
                y += 30;
                firstLine_Left.setLayoutX(x);
                firstLine_Left.setLayoutY(y);
                break;
            case UP:
                x -= 30;
                y -= 30;
                firstLine_Left.setLayoutX(x);
                firstLine_Left.setLayoutY(y);
                break;
            case RIGHT:
                x += 30;
                y -= 30;
                firstLine_Left.setLayoutX(x);
                firstLine_Left.setLayoutY(y);
                break;
            case LEFT:
                x -= 30;
                y += 30;
                firstLine_Left.setLayoutX(x);
                firstLine_Left.setLayoutY(y);
                break;
        }
    }

    public void setFirstLine_Left(double x, double y, Direction direction) {
        switch (direction) {
            case DOWN:
                x += 30;
                y += 30;
                firstLine_Left.setLayoutX(x);
                firstLine_Left.setLayoutY(y);
                break;
            case UP:
                x -= 30;
                y -= 30;
                firstLine_Left.setLayoutX(x);
                firstLine_Left.setLayoutY(y);
                break;
            case RIGHT:
                x += 30;
                y -= 30;
                firstLine_Left.setLayoutX(x);
                firstLine_Left.setLayoutY(y);
                break;
            case LEFT:
                x -= 30;
                y += 30;
                firstLine_Left.setLayoutX(x);
                firstLine_Left.setLayoutY(y);
                break;
        }

    }

    public double rabbitSee(double x, double y,double xF, double yF,Direction direction, double neuron) {

        switch (direction) {
            case DOWN:
                x += 30;
                y += 30;
                firstLine_Left.setLayoutX(x);
                firstLine_Left.setLayoutY(y);
                break;
            case UP:
                x -= 30;
                y -= 30;
                firstLine_Left.setLayoutX(x);
                firstLine_Left.setLayoutY(y);
                break;
            case RIGHT:
                x += 30;
                y -= 30;
                firstLine_Left.setLayoutX(x);
                firstLine_Left.setLayoutY(y);
                break;
            case LEFT:
                x -= 30;
                y += 30;
                firstLine_Left.setLayoutX(x);
                firstLine_Left.setLayoutY(y);
                break;
        }
        if (x == xF && y == yF || neuron==1) {
            firstLine_Left.setFill(Color.RED);
            return 1;
        }

        if (y <= 90 || y >= 630 || x <= 0 || x >= 570) {
            firstLine_Left.setFill(Color.GRAY);
            return 0;
        }

        firstLine_Left.setFill(Color.YELLOW);
        return 0.5;
    }
}