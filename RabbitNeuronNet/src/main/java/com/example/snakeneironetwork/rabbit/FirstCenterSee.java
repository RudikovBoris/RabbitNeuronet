package com.example.snakeneironetwork.rabbit;

import javafx.scene.Parent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import static com.example.snakeneironetwork.Application.neuron;

public class FirstCenterSee extends Parent {
    Direction direction;
    int x, y;
    Rectangle firstLine_Center = new Rectangle(30, 30, Color.YELLOW);

    public FirstCenterSee(int x, int y, Direction direction) {
        this.direction = direction;
        this.x = x;
        this.y = y;
        switch (direction) {
            case DOWN:
                y = y + 30;
                firstLine_Center.setLayoutX(x);
                firstLine_Center.setLayoutY(y);
                neuron.errorOutputLayer[0]=0.1;
                neuron.errorOutputLayer[1]=0;
                neuron.errorOutputLayer[2]=0.1;
                neuron.errorOutputLayer[3]=0.1;
                break;
            case UP:
                y = y - 30;
                firstLine_Center.setLayoutX(x);
                firstLine_Center.setLayoutY(y);
                neuron.errorOutputLayer[0]=0;
                neuron.errorOutputLayer[1]=0.1;
                neuron.errorOutputLayer[2]=0.1;
                neuron.errorOutputLayer[3]=0.1;
                break;
            case RIGHT:
                x = x + 30;
                firstLine_Center.setLayoutX(x);
                firstLine_Center.setLayoutY(y);
                neuron.errorOutputLayer[0]=0.1;
                neuron.errorOutputLayer[1]=0.1;
                neuron.errorOutputLayer[2]=0.1;
                neuron.errorOutputLayer[3]=0;
                break;
            case LEFT:
                x = x - 30;
                firstLine_Center.setLayoutX(x);
                firstLine_Center.setLayoutY(y);
                neuron.errorOutputLayer[0]=0.1;
                neuron.errorOutputLayer[1]=0.1;
                neuron.errorOutputLayer[2]=0;
                neuron.errorOutputLayer[3]=0.1;
                break;
        }
        getChildren().add(firstLine_Center);
    }

    public void firstLine_Center(double x, double y, Direction direction) {
        switch (direction) {
            case DOWN:
                y = y + 30;
                firstLine_Center.setLayoutX(x);
                firstLine_Center.setLayoutY(y);
                neuron.errorOutputLayer[0]=0.1;
                neuron.errorOutputLayer[1]=0;
                neuron.errorOutputLayer[2]=0.1;
                neuron.errorOutputLayer[3]=0.1;
                break;
            case UP:
                y = y - 30;
                firstLine_Center.setLayoutX(x);
                firstLine_Center.setLayoutY(y);
                neuron.errorOutputLayer[0]=0;
                neuron.errorOutputLayer[1]=0.1;
                neuron.errorOutputLayer[2]=0.1;
                neuron.errorOutputLayer[3]=0.1;
                break;
            case RIGHT:
                x = x + 30;
                firstLine_Center.setLayoutX(x);
                firstLine_Center.setLayoutY(y);
                neuron.errorOutputLayer[0]=0.1;
                neuron.errorOutputLayer[1]=0.1;
                neuron.errorOutputLayer[2]=0.1;
                neuron.errorOutputLayer[3]=0;
                break;
            case LEFT:
                x = x - 30;
                firstLine_Center.setLayoutX(x);
                firstLine_Center.setLayoutY(y);
                neuron.errorOutputLayer[0]=0.1;
                neuron.errorOutputLayer[1]=0.1;
                neuron.errorOutputLayer[2]=0;
                neuron.errorOutputLayer[3]=0.1;
                break;
        }
    }

    public double rabbitSee(double x, double y,double xF, double yF,Direction direction, double neuronSeeAllApple) {
        switch (direction) {
            case DOWN:
                y = y + 30;
                firstLine_Center.setLayoutX(x);
                firstLine_Center.setLayoutY(y);

                break;
            case UP:
                y = y - 30;
                firstLine_Center.setLayoutX(x);
                firstLine_Center.setLayoutY(y);

                break;
            case RIGHT:
                x = x + 30;
                firstLine_Center.setLayoutX(x);
                firstLine_Center.setLayoutY(y);
                break;
            case LEFT:
                x = x - 30;
                firstLine_Center.setLayoutX(x);
                firstLine_Center.setLayoutY(y);
                break;
        }

        if (x == xF && y == yF || neuronSeeAllApple==1) {


            switch (direction) {
                case DOWN:
                    neuron.errorOutputLayer[0]+=0;
                    neuron.errorOutputLayer[1]+=0.1;
                    neuron.errorOutputLayer[2]+=0;
                    neuron.errorOutputLayer[3]+=0;
                    break;
                case UP:
                    neuron.errorOutputLayer[0]=0.1;
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



            firstLine_Center.setFill(Color.RED);
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



            firstLine_Center.setFill(Color.GRAY);
            return 0;
        }

            firstLine_Center.setFill(Color.YELLOW);
            return 0.5;
    }
}