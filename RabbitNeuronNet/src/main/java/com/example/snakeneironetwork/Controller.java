package com.example.snakeneironetwork;


import com.example.snakeneironetwork.neuro_net.DataSaver;
import com.example.snakeneironetwork.neuro_net.Forward;
import com.example.snakeneironetwork.neuro_net.LearningProcess;
import com.example.snakeneironetwork.rabbit.Direction;
import com.example.snakeneironetwork.rabbit.RabbitFull;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.FileNotFoundException;
import java.util.Random;

import static com.example.snakeneironetwork.Application.neuron;

public class Controller {

    Direction direction = Direction.LEFT;
    int t = 0;
    public static int counterLearningIteration = 0;
    double counterStep = 0.5;
    public static boolean directionLeft = true;
    public static boolean directionRight = true;
    public static boolean directionDown = true;
    public static boolean directionUp = true;
    LearningProcess learningProcess = new LearningProcess();
    double counterStepForDeath = 1;
    Forward forward = new Forward();

    @FXML
    AnchorPane root;


    RabbitFull rabbit = new RabbitFull(150,150,Direction.DOWN);
    Fruit apple1,apple2,apple3,apple4,apple5 ,apple6,apple7,apple8,apple9,apple10;

    int countApple = 0;

    int counterSave = 0;


    @FXML
    TextArea textArea;


@FXML
    private void rabbitGo___FXML(KeyEvent eventKey) throws FileNotFoundException {
    neuron.inputLayer[0]=0.5;
    neuron.inputLayer[1]=0.5;
    neuron.inputLayer[2]=0.5;
    neuron.inputLayer[3]=0.5;
    neuron.inputLayer[4]=0.5;
    neuron.inputLayer[5]=0.5;
    neuron.inputLayer[6]=0.5;
    neuron.inputLayer[7]=0.5;
    neuron.inputLayer[8]=0.5;
    rabbitSeeDirectionInNeurons();
    neuron.inputLayer[13]=counterStep;
    neuron.inputLayer[14]=counterStepForDeath;

    if(eventKey.getCode() == KeyCode.ADD){rabbitLearnProcess();}

    if (eventKey.getCode() == KeyCode.W) {
        rabbit.rabbitOnTheMupAfetStep(0, -30, Direction.UP);
        rabbit.setLayoutX(rabbit.getLayoutX());
        rabbit.setLayoutY(rabbit.getLayoutY());
        direction=Direction.UP;
    }

    if (eventKey.getCode() == KeyCode.S) {
        rabbit.rabbitOnTheMupAfetStep(0, 30,Direction.DOWN);
        rabbit.setLayoutX(rabbit.getLayoutX());
        rabbit.setLayoutY(rabbit.getLayoutY());
        direction=Direction.DOWN;
    }
    if (eventKey.getCode() == KeyCode.A) {
        rabbit.rabbitOnTheMupAfetStep(-30, 0,Direction.LEFT);
        rabbit.setLayoutX(rabbit.getLayoutX());
        rabbit.setLayoutY(rabbit.getLayoutY());
        direction=Direction.LEFT;
    }
    if (eventKey.getCode() == KeyCode.D) {
        rabbit.rabbitOnTheMupAfetStep(30, 0,Direction.RIGHT);
        rabbit.setLayoutX(rabbit.getLayoutX());
        rabbit.setLayoutY(rabbit.getLayoutY());
        direction=Direction.RIGHT;
    }
    rabbitEatApple();

    if(rabbit.getFlagRabbitDeath()){
        rabbitDeath();
    }


}





    public void rabbitEatApple(){


        if (rabbit.rabbitEatApple(apple1.getLayoutX(),apple1.getLayoutY(),direction)){
                countApple++;
                textArea.setText(
                        "count=" + countApple+" counterStep=" + counterStepForDeath
                                +"counterSteps "+counterStep+" iteration " + counterLearningIteration);
                randomNewCoordinateApple(apple1);
            neuron.inputLayer[0]=1;
            neuron.errorOutputLayer[0] = 1;
            neuron.errorOutputLayer[1] = 1;
            neuron.errorOutputLayer[2] = 1;
            neuron.errorOutputLayer[3] = 1;
            }


        if (rabbit.rabbitEatApple(apple1.getLayoutX(),apple1.getLayoutY(),direction)){
            countApple++;
            textArea.setText(
                    "count=" + countApple+" counterStep=" + counterStepForDeath
                            +"counterSteps "+counterStep+" iteration " + counterLearningIteration);
           randomNewCoordinateApple(apple1);
            neuron.inputLayer[0]=1;
            neuron.errorOutputLayer[0] = 1;
            neuron.errorOutputLayer[1] = 1;
            neuron.errorOutputLayer[2] = 1;
            neuron.errorOutputLayer[3] = 1;
        }
        if (rabbit.rabbitEatApple(apple2.getLayoutX(),apple2.getLayoutY(),direction)){
            countApple++;
            textArea.setText(
                    "count=" + countApple+" counterStep=" + counterStepForDeath
                            +"counterSteps "+counterStep+" iteration " + counterLearningIteration);
            randomNewCoordinateApple(apple2);
            neuron.inputLayer[0]=1;
            neuron.errorOutputLayer[0] = 1;
            neuron.errorOutputLayer[1] = 1;
            neuron.errorOutputLayer[2] = 1;
            neuron.errorOutputLayer[3] = 1;
        }
        if (rabbit.rabbitEatApple(apple3.getLayoutX(),apple3.getLayoutY(),direction)){
            countApple++;
            textArea.setText(
                    "count=" + countApple+" counterStep=" + counterStepForDeath
                            +"counterSteps "+counterStep+" iteration " + counterLearningIteration);
            randomNewCoordinateApple(apple3);
            neuron.inputLayer[0]=1;
            neuron.errorOutputLayer[0] = 1;
            neuron.errorOutputLayer[1] = 1;
            neuron.errorOutputLayer[2] = 1;
            neuron.errorOutputLayer[3] = 1;
        }
        if (rabbit.rabbitEatApple(apple4.getLayoutX(),apple4.getLayoutY(),direction)){
            countApple++;
            textArea.setText(
                    "count=" + countApple+" counterStep=" + counterStepForDeath
                            +"counterSteps "+counterStep+" iteration " + counterLearningIteration);
            randomNewCoordinateApple(apple4);
            neuron.inputLayer[0]=1;
            neuron.errorOutputLayer[0] = 1;
            neuron.errorOutputLayer[1] = 1;
            neuron.errorOutputLayer[2] = 1;
            neuron.errorOutputLayer[3] = 1;
        }
        if (rabbit.rabbitEatApple(apple5.getLayoutX(),apple5.getLayoutY(),direction)){
            countApple++;
            textArea.setText(
                    "count=" + countApple+" counterStep=" + counterStepForDeath
                            +"counterSteps "+counterStep+" iteration " + counterLearningIteration);
            randomNewCoordinateApple(apple5);
            neuron.inputLayer[0]=1;
            neuron.errorOutputLayer[0] = 1;
            neuron.errorOutputLayer[1] = 1;
            neuron.errorOutputLayer[2] = 1;
            neuron.errorOutputLayer[3] = 1;
        }
        if (rabbit.rabbitEatApple(apple6.getLayoutX(),apple6.getLayoutY(),direction)){
            countApple++;
            textArea.setText(
                    "count=" + countApple+" counterStep=" + counterStepForDeath
                            +"counterSteps "+counterStep+" iteration " + counterLearningIteration);
            randomNewCoordinateApple(apple6);
            neuron.inputLayer[0]=1;
            neuron.errorOutputLayer[0] = 1;
            neuron.errorOutputLayer[1] = 1;
            neuron.errorOutputLayer[2] = 1;
            neuron.errorOutputLayer[3] = 1;
        }

        if (rabbit.rabbitEatApple(apple7.getLayoutX(),apple7.getLayoutY(),direction)){
            countApple++;
            textArea.setText(
                    "count=" + countApple+" counterStep=" + counterStepForDeath
                            +"counterSteps "+counterStep+" iteration " + counterLearningIteration);
            randomNewCoordinateApple(apple7);
            neuron.inputLayer[0]=1;
            neuron.errorOutputLayer[0] = 1;
            neuron.errorOutputLayer[1] = 1;
            neuron.errorOutputLayer[2] = 1;
            neuron.errorOutputLayer[3] = 1;
        }
        if (rabbit.rabbitEatApple(apple7.getLayoutX(),apple7.getLayoutY(),direction)){
            countApple++;
            textArea.setText(
                    "count=" + countApple+" counterStep=" + counterStepForDeath
                            +"counterSteps "+counterStep+" iteration " + counterLearningIteration);
            randomNewCoordinateApple(apple5);
            neuron.inputLayer[0]=1;
            neuron.errorOutputLayer[0] = 1;
            neuron.errorOutputLayer[1] = 1;
            neuron.errorOutputLayer[2] = 1;
            neuron.errorOutputLayer[3] = 1;
        }
        if (rabbit.rabbitEatApple(apple8.getLayoutX(),apple8.getLayoutY(),direction)){
            countApple++;
            textArea.setText(
                    "count=" + countApple+" counterStep=" + counterStepForDeath
                            +"counterSteps "+counterStep+" iteration " + counterLearningIteration);
            randomNewCoordinateApple(apple8);
            neuron.inputLayer[0]=1;
            neuron.errorOutputLayer[0] = 1;
            neuron.errorOutputLayer[1] = 1;
            neuron.errorOutputLayer[2] = 1;
            neuron.errorOutputLayer[3] = 1;
        }
        if (rabbit.rabbitEatApple(apple9.getLayoutX(),apple9.getLayoutY(),direction)){
            countApple++;
            textArea.setText(
                    "count=" + countApple+" counterStep=" + counterStepForDeath
                            +"counterSteps "+counterStep+" iteration " + counterLearningIteration);
            randomNewCoordinateApple(apple9);
            neuron.inputLayer[0]=1;
            neuron.errorOutputLayer[0] = 1;
            neuron.errorOutputLayer[1] = 1;
            neuron.errorOutputLayer[2] = 1;
            neuron.errorOutputLayer[3] = 1;
        }
        if (rabbit.rabbitEatApple(apple10.getLayoutX(),apple10.getLayoutY(),direction)){
            countApple++;
            textArea.setText(
                    "count=" + countApple+" counterStep=" + counterStepForDeath
                            +"counterSteps "+counterStep+" iteration " + counterLearningIteration);
            randomNewCoordinateApple(apple10);
            neuron.inputLayer[0]=1;
            neuron.errorOutputLayer[0] = 1;
            neuron.errorOutputLayer[1] = 1;
            neuron.errorOutputLayer[2] = 1;
            neuron.errorOutputLayer[3] = 1;
        }
    }
    private void appleNewCoordinate(){
        randomNewCoordinateApple(apple1);
        randomNewCoordinateApple(apple2);
        randomNewCoordinateApple(apple3);
        randomNewCoordinateApple(apple4);
        randomNewCoordinateApple(apple5);
        randomNewCoordinateApple(apple6);
        randomNewCoordinateApple(apple7);
        randomNewCoordinateApple(apple8);
        randomNewCoordinateApple(apple9);
        randomNewCoordinateApple(apple10);
    }

    public void rabbitAndAppleNewCoordinate(){
        appleNewCoordinate();
        rabbit.randomNewCoordinateRabbit();
    }

    private void randomNewCoordinateApple(Fruit fruit){

            double min = 90;
            double max = 630;
            double different = max - min;
            Random random1 = new Random();
            double y = random1.nextDouble(different + 30);
            y += min;
            int b = (int) y;
            b/=30;
            y = (double) b*30 ;


         min = 0;
         max = 570;
         different = max - min;
        Random random = new Random();
        double x = random.nextDouble(different + 30);
        x += min;
         b = (int) x;
        b/=30;
        x = (double) b*30 ;


        fruit.setFruitPictureCoordinate(x,y);
    }


    public void startGame (MouseEvent eventMouse){
        countApple = 0;
        textArea.setText("count=" + countApple+" counterStep=" + counterStepForDeath
                +"counterSteps "+counterStep+" iteration " + counterLearningIteration);
        appleNewApple();


        appleNewCoordinate();





    }

@FXML
    public void LearningModel() throws FileNotFoundException {

        countApple = 0;

        appleNewApple();
        appleNewCoordinate();



        for (int i = 0; i < 10_000_000; i++) {
            rabbitLearnProcess();

            if(i==1_000_000)
            System.out.println("score = "+i);
            if(i==2_000_000)
                System.out.println("score = "+i);

        if(i==3_000_000)
            System.out.println("score = "+i);

        if(i==4_000_000)
            System.out.println("score = "+i);

        if(i==5_000_000)
            System.out.println("score = "+i);

        if(i==6_000_000)
                System.out.println("score = "+i);
        if(i==7_000_000)
                System.out.println("score = "+i);

        if(i==8_000_000)
            System.out.println("score = "+i);

        if(i==9_000_000)
            System.out.println("score = "+i);

        if(i==1_000_000)
            System.out.println("score = "+i);
    }
}
    private void appleNewApple(){
        apple1 = new Fruit();
        apple2 = new Fruit();
        apple3 = new Fruit();
        apple4 = new Fruit();
        apple5 = new Fruit();
        apple6 = new Fruit();
        apple7 = new Fruit();
        apple8 = new Fruit();
        apple9 = new Fruit();
        apple10 = new Fruit();

        root.getChildren().add(apple1);
        root.getChildren().add(apple2);
        root.getChildren().add(apple3);
        root.getChildren().add(apple4);
        root.getChildren().add(apple5);
        root.getChildren().add(apple6);
        root.getChildren().add(apple7);
        root.getChildren().add(apple8);
        root.getChildren().add(apple9);
        root.getChildren().add(apple10);
        root.getChildren().add(rabbit);
        appleNewCoordinate();
    }


    private void rabbitSeeDirectionInNeurons() {

        /**
         * движение в верх
         */
        if (neuron.outputLayer[0] > neuron.outputLayer[1] & neuron.outputLayer[0] > neuron.outputLayer[2] & neuron.outputLayer[0] > neuron.outputLayer[3]) {
            neuron.inputLayer[9] = 1;
            neuron.inputLayer[10] = 0;
            neuron.inputLayer[11] = 0;
            neuron.inputLayer[12] = 0;
        }
        /**
         * движение в низ
         */
        if (neuron.outputLayer[1] > neuron.outputLayer[0] & neuron.outputLayer[1] > neuron.outputLayer[2] & neuron.outputLayer[1] > neuron.outputLayer[3]) {
            neuron.inputLayer[9] = 0;
            neuron.inputLayer[10] = 1;
            neuron.inputLayer[11] = 0;
            neuron.inputLayer[12] = 0;
        }
        /**
         * движение в лево
         */
        if (neuron.outputLayer[2] > neuron.outputLayer[1] & neuron.outputLayer[2] > neuron.outputLayer[3] & neuron.outputLayer[2] > neuron.outputLayer[0]) {
            neuron.inputLayer[9]  = 0;
            neuron.inputLayer[10] = 0;
            neuron.inputLayer[11] = 1;
            neuron.inputLayer[12] = 0;
        }
        /**
         * движение в право
         */
        if (neuron.outputLayer[3] > neuron.outputLayer[1] & neuron.outputLayer[3] > neuron.outputLayer[2] & neuron.outputLayer[3] > neuron.outputLayer[0]) {
            neuron.inputLayer[9] = 0;
            neuron.inputLayer[10] = 0;
            neuron.inputLayer[11] = 0;
            neuron.inputLayer[12] = 1;
        }
    }
    private void rabbitDeathDirectionAndTraining(){
        if (neuron.outputLayer[0]>neuron.outputLayer[1]&neuron.outputLayer[0]>neuron.outputLayer[2]&neuron.outputLayer[0]>neuron.outputLayer[3]){
            neuron.errorOutputLayer[0]=0;
            neuron.errorOutputLayer[1]=0.1;
            neuron.errorOutputLayer[2]=0.1;
            neuron.errorOutputLayer[3]=0.1;

        }

        if (neuron.outputLayer[1]>neuron.outputLayer[0]&neuron.outputLayer[1]>neuron.outputLayer[2]&neuron.outputLayer[1]>neuron.outputLayer[3]){
            neuron.errorOutputLayer[0]=0.1;
            neuron.errorOutputLayer[1]=0;
            neuron.errorOutputLayer[2]=0.1;
            neuron.errorOutputLayer[3]=0.1;

        }
        if (neuron.outputLayer[2]>neuron.outputLayer[1]&neuron.outputLayer[2]>neuron.outputLayer[3]&neuron.outputLayer[2]>neuron.outputLayer[0]){
            neuron.errorOutputLayer[0]=0.1;
            neuron.errorOutputLayer[1]=0.1;
            neuron.errorOutputLayer[2]=0;
            neuron.errorOutputLayer[3]=0.1;

        }
        if (neuron.outputLayer[3]>neuron.outputLayer[1]&neuron.outputLayer[3]>neuron.outputLayer[2]&neuron.outputLayer[3]>neuron.outputLayer[0]){
            neuron.errorOutputLayer[0]=0.1;
            neuron.errorOutputLayer[1]=0.1;
            neuron.errorOutputLayer[2]=0.1;
            neuron.errorOutputLayer[3]=0;

        }
    }


    private void rabbitTakeSmallReword(double reword){
        neuron.errorOutputLayer[0]+=reword;
        neuron.errorOutputLayer[1]+=reword;
        neuron.errorOutputLayer[2]+=reword;
        neuron.errorOutputLayer[3]+=reword;
    }
    private void rabbitMakeStep() {



        /**
         * движение в верх
         */
        if (neuron.outputLayer[0]>neuron.outputLayer[1]&neuron.outputLayer[0]>neuron.outputLayer[2]&neuron.outputLayer[0]>neuron.outputLayer[3]){

            if (direction==Direction.DOWN){
                neuron.errorOutputLayer[0]-=0;
                neuron.errorOutputLayer[1]-=0.5;
                neuron.errorOutputLayer[2]-=0.5;
                neuron.errorOutputLayer[3]-=0.5;
                counterStep=0;

            }


            rabbit.rabbitOnTheMupAfetStep(0, -30, Direction.UP);
            rabbit.setLayoutX(rabbit.getLayoutX());
            rabbit.setLayoutY(rabbit.getLayoutY());
            direction=Direction.UP;
        }

        /**
         * движение в низ
         */
        if (neuron.outputLayer[1]>neuron.outputLayer[0]&neuron.outputLayer[1]>neuron.outputLayer[2]&neuron.outputLayer[1]>neuron.outputLayer[3]){

            if (direction==Direction.UP){
                neuron.errorOutputLayer[0]-=0.5;
                neuron.errorOutputLayer[1]-=0;
                neuron.errorOutputLayer[2]-=0.5;
                neuron.errorOutputLayer[3]-=0.5;
                counterStep=0;
            }

            rabbit.rabbitOnTheMupAfetStep(0, 30,Direction.DOWN);
            rabbit.setLayoutX(rabbit.getLayoutX());
            rabbit.setLayoutY(rabbit.getLayoutY());
            direction=Direction.DOWN;



        }
        /**
         * движение в лево
         */
        if (neuron.outputLayer[2]>neuron.outputLayer[1]&neuron.outputLayer[2]>neuron.outputLayer[3]&neuron.outputLayer[2]>neuron.outputLayer[0]){

            if (direction==Direction.RIGHT){
                neuron.errorOutputLayer[0]-=0.5;
                neuron.errorOutputLayer[1]-=0.5;
                neuron.errorOutputLayer[2]-=0;
                neuron.errorOutputLayer[3]-=0.5;
                counterStep=0;
            }

            rabbit.rabbitOnTheMupAfetStep(-30, 0,Direction.LEFT);
            rabbit.setLayoutX(rabbit.getLayoutX());
            rabbit.setLayoutY(rabbit.getLayoutY());
            direction=Direction.LEFT;
        }

        if (neuron.outputLayer[3]>neuron.outputLayer[1]&neuron.outputLayer[3]>neuron.outputLayer[2]&neuron.outputLayer[3]>neuron.outputLayer[0]){

            if (direction==Direction.LEFT){
                neuron.errorOutputLayer[0]-=0.5;
                neuron.errorOutputLayer[1]=0.5;
                neuron.errorOutputLayer[2]-=0.5;
                neuron.errorOutputLayer[3]-=0;
                counterStep=0;
            }
            rabbit.rabbitOnTheMupAfetStep(30, 0,Direction.RIGHT);
            rabbit.setLayoutX(rabbit.getLayoutX());
            rabbit.setLayoutY(rabbit.getLayoutY());
            direction=Direction.RIGHT;
        }

    }

    private void rabbitDeath(){

        rabbitDeathDirectionAndTraining();
        rabbitAndAppleNewCoordinate();
        countApple=0;
        counterStep=0;
        counterStepForDeath=1;
        neuron.inputLayer[0]=0;
    }
    private void rabbitDeathDontEatApple(){
        neuron.errorOutputLayer[0]=0;
        neuron.errorOutputLayer[1]=0;
        neuron.errorOutputLayer[2]=0;
        neuron.errorOutputLayer[3]=0;
        rabbitDeath();
        counterStepForDeath=1;
        directionLeft = true;
        directionRight = true;
        directionDown = true;
        directionUp = true;
    }
    private void rabbitLearnProcess() throws FileNotFoundException {
        neuron.inputLayer[0]=0.2;
        neuron.inputLayer[1]=0.2;
        neuron.inputLayer[2]=0.2;
        neuron.inputLayer[3]=0.2;
        neuron.inputLayer[4]=0.2;
        neuron.inputLayer[5]=0.2;
        neuron.inputLayer[6]=0.2;
        neuron.inputLayer[7]=0.2;
        neuron.inputLayer[8]=0.2;
        rabbitSeeDirectionInNeurons();
        neuron.inputLayer[13]=counterStep;
        neuron.inputLayer[14]=counterStepForDeath;



        forward.functionNewValue(neuron.inputLayer);
        rabbitMakeStep();
        if(rabbit.rabbitGoToTheCircle){
            neuron.errorOutputLayer[0]=0;
            neuron.errorOutputLayer[1]=0;
            neuron.errorOutputLayer[2]=0;
            neuron.errorOutputLayer[3]=0;
        }
        rabbitEatApple();
        rabbitTakeSmallReword(counterStep);

        if(rabbit.getFlagRabbitDeath()){
            rabbitDeath();
        }


        if(counterStepForDeath<=0){
            rabbitDeathDontEatApple();
        }


        learningProcess.learningRabbit();

        counterStepForDeath-=0.003;
        counterStep+= 0.01;

        if(counterSave>100_000){
           saveWeightAndBias();
        }

        counterSave++;

    }

    private void saveWeightAndBias() throws FileNotFoundException {
        DataSaver dataSaver = new DataSaver();
        dataSaver.writeData(neuron.weightInput);
        dataSaver.writeData(neuron.weightHidden);
        dataSaver.writeData(neuron.weightHidden2);
        dataSaver.writeData(neuron.weightHidden3);
        dataSaver.writeData(neuron.biasInput);
        dataSaver.writeData(neuron.biasHidden);
        dataSaver.writeData(neuron.biasHidden2);
        dataSaver.writeData(neuron.biasHidden3);
        counterSave=0;
        System.out.println("neurons[0] Saved = " + neuron.outputLayer[0]);
        dataSaver.printWriter.close();
    }

}