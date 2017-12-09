package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyFiles {

        public static void main(String[] args) {
            String sourceFile = args[0];
            String targetFile = args[1];
            Copy(sourceFile, targetFile);

        }


        public static void Copy(String sourceFile, String destinationFile) {
            Path sourceFilePath = Paths.get(sourceFile);
            Path destinationFilePath = Paths.get(destinationFile);
            try {
                Files.copy(sourceFilePath, destinationFilePath, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
    }

