package com.example.snakeneironetwork.rabbit;

import javafx.scene.Parent;

import java.util.Random;

import static com.example.snakeneironetwork.Application.neuron;

public class RabbitFull extends Parent {
    public boolean rabbitGoToTheCircle;
   int rabbitX,rabbitY;
   FirstLeftSee firstLeftSee;
   FirstCenterSee firstCenterSee;
   FirstRightSee firstRightSee;
   SecondLine_Left_Left secondLine_left_left;
   SecondLine_Left secondLine_left;
   SecondLine_Center secondLine_center;

   SecondLine_Right secondLine_right;
   SecondLine_Right_Right secondLine_right_right;

   Rabbit rabbit;

    public RabbitFull(int rabbitX, int rabbitY, Direction direction) {
        this.rabbitX = rabbitX;
        this.rabbitY = rabbitY;
        rabbit = new Rabbit();
        firstLeftSee = new FirstLeftSee(rabbitX,rabbitY,direction);
        firstCenterSee = new FirstCenterSee(rabbitX,rabbitY,direction);
        firstRightSee = new FirstRightSee(rabbitX,rabbitY,direction);
        secondLine_left_left =new SecondLine_Left_Left(rabbitX,rabbitY,direction);
        secondLine_left = new SecondLine_Left(rabbitX,rabbitY,direction);
        secondLine_center = new SecondLine_Center(rabbitX,rabbitY,direction);
        secondLine_right = new SecondLine_Right(rabbitX,rabbitY,direction);
        secondLine_right_right = new SecondLine_Right_Right(rabbitX,rabbitY,direction);
        getChildren().add(rabbit);
        getChildren().add(firstLeftSee);
        getChildren().add(firstCenterSee);
        getChildren().add(firstRightSee);
        getChildren().add(secondLine_left_left);
        getChildren().add(secondLine_left);
        getChildren().add(secondLine_center);
        getChildren().add(secondLine_right);
        getChildren().add(secondLine_right_right);
    }
    private boolean flagRabbitDeath = false;
    public void rabbitOnTheMupAfetDeath(double x, double y, Direction direction){
        rabbit.rabbitHeadAfterDeath(x,y,direction);
        firstLeftSee.setFirstLine_Left(rabbit.rabbitX,rabbit.rabbitY,direction);
        firstCenterSee.firstLine_Center(rabbit.rabbitX,rabbit.rabbitY,direction);
        firstRightSee.firstLine_Right(rabbit.rabbitX,rabbit.rabbitY,direction);
        secondLine_left_left.setSecondLine_Left_Left(rabbit.rabbitX,rabbit.rabbitY,direction);
        secondLine_left.setSecondLine_Left(rabbit.rabbitX,rabbit.rabbitY,direction);
        secondLine_center.setSecondLine_Center(rabbit.rabbitX,rabbit.rabbitY,direction);
        secondLine_right.setSecondLine_Right(rabbit.rabbitX,rabbit.rabbitY,direction);
        secondLine_right_right.setSecondLine_Right_Right(rabbit.rabbitX,rabbit.rabbitY,direction);
    }
    public void rabbitOnTheMupAfetStep(double x, double y, Direction direction){
        rabbit.rabbitHeadAfterStep(x,y,direction);
        rabbitDeath();
        firstLeftSee.setFirstLine_Left(rabbit.rabbitX,rabbit.rabbitY,direction);
        firstCenterSee.firstLine_Center(rabbit.rabbitX,rabbit.rabbitY,direction);
        firstRightSee.firstLine_Right(rabbit.rabbitX,rabbit.rabbitY,direction);
        secondLine_left_left.setSecondLine_Left_Left(rabbitX,rabbitY,direction);
        secondLine_left.setSecondLine_Left(rabbitX,rabbitY,direction);
        secondLine_center.setSecondLine_Center(rabbit.rabbitX,rabbit.rabbitY,direction);
        secondLine_right.setSecondLine_Right(rabbitX,rabbitY,direction);
        secondLine_right_right.setSecondLine_Right_Right(rabbitX,rabbitY,direction);
        rabbitGoToTheCircle=rabbit.rabbitGoToTheCircle();
    }
    public void rabbitDeath () {
        if (rabbit.rabbitY<90||rabbit.rabbitY>630||rabbit.rabbitX<0||rabbit.rabbitX>570){
            flagRabbitDeath= true;
        }
    }

    public void randomNewCoordinateRabbit(){
        
        

        int min = 90;
        int max = 630;
        int different = max - min;
        Random random1 = new Random();
        double y = random1.nextDouble(different +30);
        y += min;
        int b = (int) y;
        b/=30;
        y =  b*30 ;


        min = 0;
        max = 570;
        different = max - min;
        Random random = new Random();
        double x = random.nextDouble(different+30 );
        x += min;
        b = (int) x;
        b/=30;
        x= (double) b*30 ;
        


        min = 0;
        max = 4;
        different = max - min;
        double doubleDirection = random.nextDouble(3 );
        int intDirection = (int) doubleDirection;

        switch (intDirection){
            case 0:
                rabbit.rabbitX = x;
                rabbit.rabbitY = y;
                rabbitOnTheMupAfetDeath(x,y,Direction.UP);

                break;
            case 1:
                rabbit.rabbitX = x;
                rabbit.rabbitY = y;
                rabbitOnTheMupAfetDeath(x,y,Direction.DOWN);
                break;
            case 2:
                rabbit.rabbitX = x;
                rabbit.rabbitY = y;
                rabbitOnTheMupAfetDeath(x,y,Direction.RIGHT);
                break;
            case 3:
                rabbit.rabbitX = x;
                rabbit.rabbitY = y;
                rabbitOnTheMupAfetDeath(x,y,Direction.LEFT);
                break;
        }
        

        flagRabbitDeath=false;
    }
    public boolean getFlagRabbitDeath(){
        return flagRabbitDeath;
    }

    public boolean rabbitEatApple(double x, double y,Direction direction){
        neuron.inputLayer[1] = firstRightSee.rabbitSee(rabbit.getRabbitX(),rabbit.getRabbitY(),x,y,direction,neuron.inputLayer[1]);
        neuron.inputLayer[2] = firstCenterSee.rabbitSee(rabbit.getRabbitX(),rabbit.getRabbitY(),x,y,direction,neuron.inputLayer[2]);
        neuron.inputLayer[3] = firstLeftSee.rabbitSee(rabbit.getRabbitX(),rabbit.getRabbitY(),x,y,direction,neuron.inputLayer[3]);
        neuron.inputLayer[4] = secondLine_left_left.rabbitSee(rabbit.getRabbitX(),rabbit.getRabbitY(),x,y,direction,neuron.inputLayer[4]);
        neuron.inputLayer[5] = secondLine_left.rabbitSee(rabbit.getRabbitX(),rabbit.getRabbitY(),x,y,direction,neuron.inputLayer[5]);
        neuron.inputLayer[6] = secondLine_center.rabbitSee(rabbit.getRabbitX(),rabbit.getRabbitY(),x,y,direction,neuron.inputLayer[6]);
        neuron.inputLayer[7] = secondLine_right.rabbitSee(rabbit.getRabbitX(),rabbit.getRabbitY(),x,y,direction,neuron.inputLayer[7]);
        neuron.inputLayer[8] = secondLine_right_right.rabbitSee(rabbit.getRabbitX(),rabbit.getRabbitY(),x,y,direction,neuron.inputLayer[8]);
        if (rabbit.rabbitEatApple(x,y)){
            return true;
        }
        return false;
    }


    public double getXRabbit(){
        return rabbit.getLayoutX();
    }
    public double getYRabbit(){
        return rabbit.getLayoutY();
    }
}
