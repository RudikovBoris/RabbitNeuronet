package com.example.snakeneironetwork.neuro_net;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import static com.example.snakeneironetwork.Application.file;


public class DataSaver {

     public PrintWriter printWriter = new PrintWriter(file);

    public DataSaver() throws FileNotFoundException {
    }


    public void writeData(double[] layer) {

        for (int i = 0; i < layer.length; i++) {
            printWriter.print(layer[i] + " ");
        }
        printWriter.println();

    }

}
