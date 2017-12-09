package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {

    public static void main(String[] args) {
        try {
            String startPath = args[0];
            String fileName = args[1];
            findFile(startPath, fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static void findFile(String startPath, String fileNameToFind) throws IOException {
        if (startPath == null) {
            System.out.println("Error: Start path " + startPath + "  is empty");
            return;
        }

        File startCatalog = new File(startPath);
        if (!startCatalog.exists()) {
            System.out.println("Error: Start path " + startPath + " does not exist");
            return;
        }

        // String[] list = f.list(); // список имён файлов в текущей папке
        File[] listFiles = startCatalog.listFiles();

        if (listFiles == null) {
            System.out.println("Error: There are no files in start path");
            return;
        }

        for (File fileInCatalog : listFiles) {
            if (fileInCatalog.isDirectory()) {
                findFile(fileInCatalog.getAbsolutePath(), fileNameToFind); // recursive
            } else {
            }
            if (fileNameToFind.equals(fileInCatalog.getName()) | fileInCatalog.getName().startsWith(fileNameToFind)) {
                System.out.println("file found [" + fileInCatalog.getCanonicalPath() + "]");
            }
        }
    }


    public static void printFileDescription(File file) throws IOException {
        System.out.println("Name           : " + file.getName());
        System.out.println("Path           : " + file.getPath());
        System.out.println("Absolute path  : " + file.getAbsolutePath());
        System.out.println("Canonical path : " + file.getCanonicalPath());
        System.out.println("Parent         : " + file.getParent());
        System.out.println("-----------------------------");
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
