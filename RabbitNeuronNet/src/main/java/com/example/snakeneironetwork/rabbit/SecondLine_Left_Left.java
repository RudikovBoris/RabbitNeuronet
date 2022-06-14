package com.example.snakeneironetwork.rabbit;

import javafx.scene.Parent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class SecondLine_Left_Left extends Parent {
    Direction direction;

    Rectangle secondLine_Left_Left = new Rectangle(30, 30, Color.YELLOW);

    public SecondLine_Left_Left(int x, int y, Direction direction) {
        this.direction = direction;
        getChildren().add(secondLine_Left_Left);

        switch (direction) {
            case DOWN:
                x += 60;
                y += 60;
                secondLine_Left_Left.setLayoutX(x);
                secondLine_Left_Left.setLayoutY(y);
                break;
            case UP:
                x -= 60;
                y -= 60;
                secondLine_Left_Left.setLayoutX(x);
                secondLine_Left_Left.setLayoutY(y);
                break;
            case RIGHT:
                x += 60;
                y -= 60;
                secondLine_Left_Left.setLayoutX(x);
                secondLine_Left_Left.setLayoutY(y);
                break;
            case LEFT:
                x -= 60;
                y += 60;
                secondLine_Left_Left.setLayoutX(x);
                secondLine_Left_Left.setLayoutY(y);
                break;
        }
    }

    public void setSecondLine_Left_Left(double x, double y, Direction direction) {
        switch (direction) {
            case DOWN:
                x += 60;
                y += 60;
                secondLine_Left_Left.setLayoutX(x);
                secondLine_Left_Left.setLayoutY(y);
                break;
            case UP:
                x -= 60;
                y -= 60;
                secondLine_Left_Left.setLayoutX(x);
                secondLine_Left_Left.setLayoutY(y);
                break;
            case RIGHT:
                x += 60;
                y -= 60;
                secondLine_Left_Left.setLayoutX(x);
                secondLine_Left_Left.setLayoutY(y);
                break;
            case LEFT:
                x -= 60;
                y += 60;
                secondLine_Left_Left.setLayoutX(x);
                secondLine_Left_Left.setLayoutY(y);
                break;
        }

    }

    public double rabbitSee(double x, double y,double xF, double yF,Direction direction, double neuron) {

        switch (direction) {
            case DOWN:
                x += 60;
                y += 60;
                secondLine_Left_Left.setLayoutX(x);
                secondLine_Left_Left.setLayoutY(y);
                break;
            case UP:
                x -= 60;
                y -= 60;
                secondLine_Left_Left.setLayoutX(x);
                secondLine_Left_Left.setLayoutY(y);
                break;
            case RIGHT:
                x += 60;
                y -= 60;
                secondLine_Left_Left.setLayoutX(x);
                secondLine_Left_Left.setLayoutY(y);
                break;
            case LEFT:
                x -= 60;
                y += 60;
                secondLine_Left_Left.setLayoutX(x);
                secondLine_Left_Left.setLayoutY(y);
                break;
        }
        if (x == xF && y == yF||neuron==1) {
            secondLine_Left_Left.setFill(Color.RED);
            return 1;
        }

        if (y <= 90 || y >= 630 || x <= 0 || x >= 570) {
            secondLine_Left_Left.setFill(Color.GRAY);
            return 0;
        }

            secondLine_Left_Left.setFill(Color.YELLOW);
            return 0.5;
    }
}
