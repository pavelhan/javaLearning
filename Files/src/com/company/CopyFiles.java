package com.company;

import org.omg.IOP.Encoding;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.List;

import static java.nio.file.Files.createFile;

public class CopyFiles {

    public static void main(String[] args) {
        String sourceFile = args[0];
        String targetFile = args[1];
        Charset charset = Charset.forName(args[2]);
        Copy(sourceFile, targetFile, charset);

    }


    public static void Copy(String sourceFile, String destinationFile, Charset encoding) {
        Path sourceFilePath = Paths.get(sourceFile);
        Path destinationFilePath = Paths.get(destinationFile);
        try {
            if (!Files.exists(destinationFilePath)) {
                File file = new File(destinationFile);
                file.createNewFile();
            }

            if (Files.exists(sourceFilePath)) {
                List<String> lines = Files.readAllLines(sourceFilePath, encoding);

                BufferedWriter writer = Files.newBufferedWriter(destinationFilePath, encoding, StandardOpenOption.WRITE);
                for (int i = 0; i < lines.size(); i++) {
                    writer.write(String.format(lines.get(i) + "\r\n"));
                }
                writer.close();



                //Files.copy(sourceFilePath, destinationFilePath, StandardCopyOption.REPLACE_EXISTING);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}

