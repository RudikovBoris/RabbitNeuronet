package com.example.snakeneironetwork.rabbit;

import javafx.scene.Parent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class SecondLine_Right_Right extends Parent {
    Direction direction;

    Rectangle secondLine_Right_Right = new Rectangle(30, 30, Color.YELLOW);

    public SecondLine_Right_Right(int x, int y, Direction direction) {
        this.direction = direction;
        getChildren().add(secondLine_Right_Right);

        switch (direction) {
            case DOWN:
                x -= 60;
                y += 60;
                secondLine_Right_Right.setLayoutX(x);
                secondLine_Right_Right.setLayoutY(y);
                break;
            case UP:
                x += 60;
                y -= 60;
                secondLine_Right_Right.setLayoutX(x);
                secondLine_Right_Right.setLayoutY(y);
                break;
            case RIGHT:
                x += 60;
                y += 60;
                secondLine_Right_Right.setLayoutX(x);
                secondLine_Right_Right.setLayoutY(y);
                break;
            case LEFT:
                x -= 60;
                y -= 60;
                secondLine_Right_Right.setLayoutX(x);
                secondLine_Right_Right.setLayoutY(y);
                break;
        }
    }

    public void setSecondLine_Right_Right(double x, double y, Direction direction) {
        switch (direction) {
            case DOWN:
                x -= 60;
                y += 60;
                secondLine_Right_Right.setLayoutX(x);
                secondLine_Right_Right.setLayoutY(y);
                break;
            case UP:
                x += 60;
                y -= 60;
                secondLine_Right_Right.setLayoutX(x);
                secondLine_Right_Right.setLayoutY(y);
                break;
            case RIGHT:
                x += 60;
                y += 60;
                secondLine_Right_Right.setLayoutX(x);
                secondLine_Right_Right.setLayoutY(y);
                break;
            case LEFT:
                x -= 60;
                y -= 60;
                secondLine_Right_Right.setLayoutX(x);
                secondLine_Right_Right.setLayoutY(y);
                break;
        }

    }

    public double rabbitSee(double x, double y,double xF, double yF,Direction direction, double neuron) {

        switch (direction) {
            case DOWN:
                x -= 60;
                y += 60;
                secondLine_Right_Right.setLayoutX(x);
                secondLine_Right_Right.setLayoutY(y);
                break;
            case UP:
                x += 60;
                y -= 60;
                secondLine_Right_Right.setLayoutX(x);
                secondLine_Right_Right.setLayoutY(y);
                break;
            case RIGHT:
                x += 60;
                y += 60;
                secondLine_Right_Right.setLayoutX(x);
                secondLine_Right_Right.setLayoutY(y);
                break;
            case LEFT:
                x -= 60;
                y -= 60;
                secondLine_Right_Right.setLayoutX(x);
                secondLine_Right_Right.setLayoutY(y);
                break;
        }
        if (x == xF && y == yF||neuron==1) {
            secondLine_Right_Right.setFill(Color.RED);
            return 1;
        }

        if (y <= 90 || y >= 630 || x <= 0 || x >= 570) {
            secondLine_Right_Right.setFill(Color.GRAY);
            return 0;
        }

            secondLine_Right_Right.setFill(Color.YELLOW);
            return 0.5;
    }
}
