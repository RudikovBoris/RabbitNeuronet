package com.example.snakeneironetwork.neuro_net;

import java.io.FileNotFoundException;

import static com.example.snakeneironetwork.Application.file;
import static com.example.snakeneironetwork.Application.neuron;


public class Net {



    public void makeNewOrWriteFromFile() throws FileNotFoundException {
        ReaderData readerData = new ReaderData();

        if ( file.length()== 0) {
            neuron.averageMeaning();
        }else {
            readerData.readData(neuron.weightInput, neuron.weightHidden, neuron.weightHidden2, neuron.weightHidden3
                    , neuron.biasInput, neuron.biasHidden, neuron.biasHidden2, neuron.biasHidden2);
        }
    }

}