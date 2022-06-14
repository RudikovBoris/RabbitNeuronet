package com.example.snakeneironetwork.neuro_net;

import com.example.snakeneironetwork.Controller;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static com.example.snakeneironetwork.Application.*;


public class LearningProcess {


    Forward forward = new Forward();



    Learning learning =new Learning();









    public void learningRabbit(){
        Controller.counterLearningIteration++;
        learning.learningProcess();
    }

}






