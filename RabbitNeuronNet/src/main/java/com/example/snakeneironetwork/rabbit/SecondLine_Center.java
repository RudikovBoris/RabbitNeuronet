package com.example.snakeneironetwork.rabbit;

import javafx.scene.Parent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import static com.example.snakeneironetwork.Application.neuron;

public class SecondLine_Center extends Parent {


    Direction direction;

    Rectangle secondLine_Center = new Rectangle(30, 30, Color.YELLOW);

    public SecondLine_Center(int x, int y, Direction direction) {
        this.direction = direction;
        getChildren().add(secondLine_Center);

        switch (direction) {
            case DOWN:
                y += 60;
                secondLine_Center.setLayoutX(x);
                secondLine_Center.setLayoutY(y);
                break;
            case UP:
                y -= 60;
                secondLine_Center.setLayoutX(x);
                secondLine_Center.setLayoutY(y);
                break;
            case RIGHT:
                x += 60;
                secondLine_Center.setLayoutX(x);
                secondLine_Center.setLayoutY(y);
                break;
            case LEFT:
                x -= 60;
                secondLine_Center.setLayoutX(x);
                secondLine_Center.setLayoutY(y);
                break;
        }
    }

    public void setSecondLine_Center(double x, double y, Direction direction) {
        switch (direction) {
            case DOWN:
                y += 60;
                secondLine_Center.setLayoutX(x);
                secondLine_Center.setLayoutY(y);
                break;
            case UP:
                y -= 60;
                secondLine_Center.setLayoutX(x);
                secondLine_Center.setLayoutY(y);
                break;
            case RIGHT:
                x += 60;
                secondLine_Center.setLayoutX(x);
                secondLine_Center.setLayoutY(y);
                break;
            case LEFT:
                x -= 60;
                secondLine_Center.setLayoutX(x);
                secondLine_Center.setLayoutY(y);
                break;
        }
    }

    public double rabbitSee(double x, double y,double xF, double yF,Direction direction, double neuronForAllApple) {

        switch (direction) {
            case DOWN:
                y += 60;
                secondLine_Center.setLayoutX(x);
                secondLine_Center.setLayoutY(y);
                break;
            case UP:
                y -= 60;
                secondLine_Center.setLayoutX(x);
                secondLine_Center.setLayoutY(y);
                break;
            case RIGHT:
                x += 60;
                secondLine_Center.setLayoutX(x);
                secondLine_Center.setLayoutY(y);
                break;
            case LEFT:
                x -= 60;
                secondLine_Center.setLayoutX(x);
                secondLine_Center.setLayoutY(y);
                break;
        }
        if (x == xF && y == yF||neuronForAllApple==1) {

            switch (direction) {
                case DOWN:
                    neuron.errorOutputLayer[0]+=0;
                    neuron.errorOutputLayer[1]+=0.1;
                    neuron.errorOutputLayer[2]+=0;
                    neuron.errorOutputLayer[3]+=0;
                    break;
                case UP:
                    neuron.errorOutputLayer[0]+=0.1;
                    neuron.errorOutputLayer[1]+=0;
                    neuron.errorOutputLayer[2]+=0;
                    neuron.errorOutputLayer[3]+=0;
                    break;
                case RIGHT:
                    neuron.errorOutputLayer[0]+=0;
                    neuron.errorOutputLayer[1]+=0;
                    neuron.errorOutputLayer[2]+=0;
                    neuron.errorOutputLayer[3]+=0.1;
                    break;
                case LEFT:
                    neuron.errorOutputLayer[0]+=0;
                    neuron.errorOutputLayer[1]+=0;
                    neuron.errorOutputLayer[2]+=0.1;
                    neuron.errorOutputLayer[3]+=0;
                    break;
            }


            secondLine_Center.setFill(Color.RED);
            return 1;
        }

        if (y <= 90 || y >= 630 || x <= 0 || x >= 570) {


            switch (direction) {
                case DOWN:
                    neuron.errorOutputLayer[0]-=0;
                    neuron.errorOutputLayer[1]-=0.1;
                    neuron.errorOutputLayer[2]-=0;
                    neuron.errorOutputLayer[3]-=0;
                    break;
                case UP:
                    neuron.errorOutputLayer[0]-=0.1;
                    neuron.errorOutputLayer[1]-=0;
                    neuron.errorOutputLayer[2]-=0;
                    neuron.errorOutputLayer[3]-=0;
                    break;
                case RIGHT:
                    neuron.errorOutputLayer[0]-=0;
                    neuron.errorOutputLayer[1]-=0;
                    neuron.errorOutputLayer[2]-=0;
                    neuron.errorOutputLayer[3]-=0.1;
                    break;
                case LEFT:
                    neuron.errorOutputLayer[0]-=0;
                    neuron.errorOutputLayer[1]-=0;
                    neuron.errorOutputLayer[2]-=0.1;
                    neuron.errorOutputLayer[3]-=0;
                    break;
            }


            secondLine_Center.setFill(Color.GRAY);
            return 0;
        }

            secondLine_Center.setFill(Color.YELLOW);
            return 0.5;
    }
}
