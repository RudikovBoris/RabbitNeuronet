package com.example.snakeneironetwork.neuro_net;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static com.example.snakeneironetwork.Application.file;


public class ReaderData {

    public void readData(double[] weight1,double[] weight2,double[] weight3,double[] weight4, double[] bias1, double[] bias2, double[] bias3, double[] bias4) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String line = new String();
        String line2 = new String();
        String line3 = new String();
        String line4 = new String();
        String line5 = new String();
        String line6 = new String();
        String line7 = new String();
        String line8 = new String();

        int count=0;
        while (scanner.hasNextLine()){
            count++;
            if (count==1) {
                line = scanner.nextLine();
            }
            if (count == 2) {
                line2=scanner.nextLine();
            }
            if (count==3) {
                line3 = scanner.nextLine();
            }
            if (count == 4) {
                line4=scanner.nextLine();
            }
            if (count==5) {
                line5 = scanner.nextLine();
            }
            if (count == 6) {
                line6=scanner.nextLine();
            }
            if (count==7) {
                line7 = scanner.nextLine();
            }
            if (count == 8) {
                line8=scanner.nextLine();
            }
        }

        scanner.close();



        String[] lineEray1 = line.split(" ");
        String[] lineEray2 = line2.split(" ");
        String[] lineEray3 = line3.split(" ");
        String[] lineEray4 = line4.split(" ");
        String[] lineEray5 = line5.split(" ");
        String[] lineEray6 = line6.split(" ");
        String[] lineEray7 = line7.split(" ");
        String[] lineEray8 = line8.split(" ");

        double[] lineDouble1 = new double[lineEray1.length];
        for (int i = 0; i < lineDouble1.length; i++) {
            lineDouble1[i] = Double.parseDouble(lineEray1[i]);
            weight1[i] = lineDouble1[i];
        }
        double[] lineDouble2 = new double[lineEray2.length];
        for (int i = 0; i < lineDouble2.length; i++) {
            lineDouble2[i] = Double.parseDouble(lineEray2[i]);
            weight2[i] = lineDouble2[i];
        }

        double[] lineDouble3 = new double[lineEray3.length];
        for (int i = 0; i < lineDouble3.length; i++) {
            lineDouble3[i] = Double.parseDouble(lineEray3[i]);
            weight3[i] = lineDouble3[i];
        }
        double[] lineDouble4 = new double[lineEray4.length];
        for (int i = 0; i < lineDouble4.length; i++) {
            lineDouble4[i] = Double.parseDouble(lineEray4[i]);
            weight4[i] = lineDouble4[i];
        }

        double[] lineDouble5 = new double[lineEray5.length];
        for (int i = 0; i < lineDouble5.length; i++) {
            lineDouble5[i] = Double.parseDouble(lineEray5[i]);
            bias1[i] = lineDouble5[i];
        }
        double[] lineDouble6 = new double[lineEray6.length];
        for (int i = 0; i < lineDouble6.length; i++) {
            lineDouble6[i] = Double.parseDouble(lineEray6[i]);
            bias2[i] = lineDouble6[i];
        }
        double[] lineDouble7 = new double[lineEray7.length];
        for (int i = 0; i < lineDouble7.length; i++) {
            lineDouble7[i] = Double.parseDouble(lineEray7[i]);
            bias3[i] = lineDouble7[i];
        }
        double[] lineDouble8 = new double[lineEray8.length];
        for (int i = 0; i < lineDouble8.length; i++) {
            lineDouble8[i] = Double.parseDouble(lineEray8[i]);
            bias4[i] = lineDouble8[i];
        }

    }

}
