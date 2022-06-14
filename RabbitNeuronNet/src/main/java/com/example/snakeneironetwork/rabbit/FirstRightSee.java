package com.example.snakeneironetwork.rabbit;

import javafx.scene.Parent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class FirstRightSee extends Parent {
    Direction direction;
    int x,y;
    Rectangle firstLine_Right = new Rectangle(30,30, Color.YELLOW);

    public FirstRightSee( int x, int y,Direction direction) {
        getChildren().add(firstLine_Right);
        this.direction = direction;
        this.x = x;
        this.y = y;

        switch (direction) {
            case DOWN:
                x = x - 30;
                y = y + 30;
                firstLine_Right.setLayoutX(x);
                firstLine_Right.setLayoutY(y);
                break;
            case UP:
                x = x + 30;
                y = y - 30;
                firstLine_Right.setLayoutX(x);
                firstLine_Right.setLayoutY(y);
                break;
            case RIGHT:
                x = x + 30;
                y = y + 30;
                firstLine_Right.setLayoutX(x);
                firstLine_Right.setLayoutY(y);
                break;
            case LEFT:
                x = x - 30;
                y = y - 30;
                firstLine_Right.setLayoutX(x);
                firstLine_Right.setLayoutY(y);
                break;
        }

    }


    public void firstLine_Right(double x, double y, Direction direction){
        switch (direction) {
            case DOWN:
                x = x - 30;
                y = y + 30;
                firstLine_Right.setLayoutX(x);
                firstLine_Right.setLayoutY(y);
                break;
            case UP:
                x = x + 30;
                y = y - 30;
                firstLine_Right.setLayoutX(x);
                firstLine_Right.setLayoutY(y);
                break;
            case RIGHT:
                x = x + 30;
                y = y + 30;
                firstLine_Right.setLayoutX(x);
                firstLine_Right.setLayoutY(y);
                break;
            case LEFT:
                x = x - 30;
                y = y - 30;
                firstLine_Right.setLayoutX(x);
                firstLine_Right.setLayoutY(y);
                break;
        }
    }

    public double rabbitSee(double x, double y,double xF, double yF,Direction direction, double neuron) {
        switch (direction) {
            case DOWN:
                x = x - 30;
                y = y + 30;
                firstLine_Right.setLayoutX(x);
                firstLine_Right.setLayoutY(y);
                break;
            case UP:
                x = x + 30;
                y = y - 30;
                firstLine_Right.setLayoutX(x);
                firstLine_Right.setLayoutY(y);
                break;
            case RIGHT:
                x = x + 30;
                y = y + 30;
                firstLine_Right.setLayoutX(x);
                firstLine_Right.setLayoutY(y);
                break;
            case LEFT:
                x = x - 30;
                y = y - 30;
                firstLine_Right.setLayoutX(x);
                firstLine_Right.setLayoutY(y);
                break;
        }

        if (x == xF && y == yF || neuron==1) {
            firstLine_Right.setFill(Color.RED);
            return 1;
        }

        if (y <= 90 || y >= 630 || x <= 0 || x >= 570) {
            firstLine_Right.setFill(Color.GRAY);
            return 0;
        }

            firstLine_Right.setFill(Color.YELLOW);
            return 0.5;
    }
}
