package com.example.snakeneironetwork.neuro_net;

import java.io.FileNotFoundException;


public class Neurons {


    int inputNeuron, hiddenNeuron, hiddenNeuron2, hiddenNeuron3, outputNeuron;



    double outFromSoftMax = 0;
    public double[] inputLayer ;

    double[] hiddenLayer;
    double[] hiddenLayer2;
    double[] hiddenLayer3;
    public double[] outputLayer;

    public double[] errorOutputLayer;

    public double[] weightInput ;
    public double[] weightHidden;
    public double[] weightHidden2;
    public double[] weightHidden3;
    public double[] biasInput;
    public double[] biasHidden;
    public double[] biasHidden2;
    public double[] biasHidden3;




    public Neurons(int input,  int output) throws FileNotFoundException {
        this.inputNeuron = input;
        this.outputNeuron = output;


        hiddenNeuron = 50;
        hiddenNeuron2 = 50;
        hiddenNeuron3 =20;





        inputLayer = new double[input];
        hiddenLayer = new double[hiddenNeuron];
        hiddenLayer2 = new double[hiddenNeuron2];
        hiddenLayer3 = new double[hiddenNeuron3];
        outputLayer = new double[output];
        errorOutputLayer = new double[output];

weightInput = new double[inputLayer.length*hiddenLayer.length];
weightHidden = new double[hiddenLayer.length*hiddenLayer2.length];
weightHidden2 = new double[hiddenLayer2.length*hiddenLayer3.length];
weightHidden3 = new double[hiddenLayer3.length*outputLayer.length];

         biasInput = new double[hiddenLayer.length];
         biasHidden = new double[hiddenLayer2.length];
         biasHidden2 = new double[hiddenLayer3.length];
        biasHidden3 = new double[outputLayer.length];
    }






    public void averageMeaning () throws FileNotFoundException {





        for (int i = 0; i < weightInput.length; i++) {
            weightInput[i] =  Math.random()/2 ;
        }

        for (int i = 0; i < weightHidden.length; i++) {
            weightHidden[i]= Math.random()/2;
        }
        for (int i = 0; i < weightHidden2.length; i++) {
            weightHidden2[i]= Math.random()/2;
        }
        for (int i = 0; i < weightHidden3.length; i++) {
            weightHidden3[i]= Math.random()/2;
        }
        for (int i = 0; i < biasInput.length; i++) {
            biasInput[i]= Math.random()/2;
        }
        for (int i = 0; i < biasHidden.length; i++) {
            biasHidden[i]= Math.random()/2;
        }
        for (int i = 0; i < biasHidden2.length; i++) {
            biasHidden2[i]= Math.random()/2;
        }
        for (int i = 0; i < biasHidden3.length; i++) {
            biasHidden3[i]= Math.random()/2;
        }

        DataSaver dataSaver = new DataSaver();
        dataSaver.writeData(weightInput);
        dataSaver.writeData(weightHidden);
        dataSaver.writeData(weightHidden2);
        dataSaver.writeData(weightHidden3);
        dataSaver.writeData(biasInput);
        dataSaver.writeData(biasHidden);
        dataSaver.writeData(biasHidden2);
        dataSaver.writeData(biasHidden3);
        dataSaver.printWriter.close();

      //  flagData = true;
    }






}
