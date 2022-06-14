package com.example.snakeneironetwork;

import com.example.snakeneironetwork.neuro_net.Net;
import com.example.snakeneironetwork.neuro_net.Neurons;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Application extends javafx.application.Application {

    public static Neurons neuron;

    public static File file = new File("weightsAndBias.txt");
    static {
        try {
            neuron = new Neurons(15,4);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Net net = new Net();


    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("rabbitField.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 660, Color.BLACK);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        net.makeNewOrWriteFromFile();
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}