package com.example.snakeneironetwork.rabbit;

import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Rabbit extends Parent {
    int countStep = 0;
    double[] rabbitStepX = new double[10];
    double[] rabbitStepY = new double[10];
    double rabbitX,rabbitY;
    Image rabbitDown = new Image("rabbit2Down.png");
    Image rabbitUp   = new Image("rabbit2Up.png");
    Image rabbitLeft = new Image("rabbit2Left.png");
    Image rabbitRight = new Image("rabbit2Right.png");
    ImageView rabbit = new ImageView(rabbitDown);

    public Rabbit() {

            rabbit.setFitHeight(30);
            rabbit.setFitWidth(30);
            getChildren().add(rabbit);

    }


    public void rabbitHeadAfterDeath(double x, double y, Direction direction) {
        switch (direction) {
            case DOWN:
                rabbit.setImage(rabbitDown);
                break;
            case UP:
                rabbit.setImage(rabbitUp);
                break;
            case RIGHT:
                rabbit.setImage(rabbitRight);
                break;
            case LEFT:
                rabbit.setImage(rabbitLeft);
                break;
        }


        rabbitY = y;
        rabbit.setLayoutY(rabbitY);


        rabbitX = x;
        rabbit.setLayoutX(rabbitX);
    }
    public void rabbitHeadAfterStep(double x, double y, Direction direction) {
        switch (direction) {
            case DOWN:
                rabbit.setImage(rabbitDown);
                break;
            case UP:
                rabbit.setImage(rabbitUp);
                break;
            case RIGHT:
                rabbit.setImage(rabbitRight);
                break;
            case LEFT:
                rabbit.setImage(rabbitLeft);
                break;
        }


        if (y != 0) {
            rabbitY += y;
            rabbit.setLayoutY(rabbitY);
        }
        if (x != 0) {
            rabbitX += x;
            rabbit.setLayoutX(rabbitX);
        }
    }

    public boolean rabbitEatApple(double x, double y){
        if (rabbit.getLayoutX()==x&&rabbit.getLayoutY()==y){
            return true;
        }
        return false;
    }

    public boolean rabbitGoToTheCircle(){
        for (int i = 0; i < rabbitStepX.length; i++) {
            if(rabbit.getLayoutX()==rabbitStepX[i]&&rabbit.getLayoutY()==rabbitStepY[i]){
                return true;
            }}
                rabbitStepX[countStep]=rabbit.getLayoutX();
                rabbitStepY[countStep]=rabbit.getLayoutY();
                countStep++;
                if(countStep==rabbitStepX.length){
                    countStep=0;
                }

        return false;
    }
    public double getRabbitX(){
        return rabbit.getLayoutX();
    }

    public double getRabbitY(){
        return rabbit.getLayoutY();
    }


}
