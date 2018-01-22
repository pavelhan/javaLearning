package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        String path = "D:\\JavaLearning\\payments_input.txt";
        String str;
        ArrayList<Payments> payments = new ArrayList<Payments>();
        int suffics = 1;

        // try {
        // inputStream = new FileInputStream("C:\\!!!\\test\\input.txt");
        // java 7
        try (FileInputStream inputStreamLocal = new FileInputStream(path);
             InputStreamReader inputStreamReaderLocal = new InputStreamReader(
                     inputStreamLocal, "CP1251");
             BufferedReader bufferReaderLocal = new BufferedReader(
                     inputStreamReaderLocal);) {

            // int data = inputStream.read();
            bufferReaderLocal.readLine();

            while ((str = bufferReaderLocal.readLine()) != null) {
                String [] fileData = str.split("\\|");
                Payments payment = new Payments(Integer.parseInt(fileData[0]), fileData[1], Double.parseDouble(fileData[2]));
                payments.add(payment);

                try ( ObjectOutputStream out = new ObjectOutputStream(new 	FileOutputStream("D:\\JavaLearning\\javaLearning\\SerializationII\\ukrtelecom" + suffics++ + ".dat"))) {
                    out.writeObject(payment);
                }catch (IOException e){

                }

                System.out.println(str);
            }
        }
        // finally {
        // if (inputStream != null) {
        // inputStream.close();
        // }
        //
        // }



    }
}
