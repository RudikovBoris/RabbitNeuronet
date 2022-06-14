package com.example.snakeneironetwork;

import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Random;

public class Fruit extends Parent {
      double x,y;
    Fruit() {

        Image apple_png = new Image("apple.png");

        ImageView apple = new ImageView(apple_png);
        apple.setFitWidth(30);
        apple.setFitHeight(30);
        apple.setLayoutX(0);
        apple.setLayoutY(0);
        getChildren().add(apple);
    }


    private double randomCoordinateX() {
        double min = 0;
        double max = 570;
        double different = max - min;
        Random random = new Random();
        double a = random.nextDouble(different + 30);
        a += min;
        int b = (int) a;
        b/=30;
        a= (double) b*30;
        this.x = a;
        return a;
    }

    private double randomCoordinateY() {
        double min = 90;
        double max = 630;
        double different = max - min;
        Random random1 = new Random();
        double a = random1.nextDouble(different + 30);
        a += min;
        int b = (int) a;
        b/=30;
        a= (double) b*30;
        this.y = a;
        return a;
    }

    public void setFruitPictureCoordinate(double x, double y){
        setLayoutX(x);
        setLayoutY(y);
    };
    public double getFruitCoordinateX(){
        return x;
    }
    public double getFruitCoordinateY(){
        return y;
    }
}