package com.johurulIslam.main.exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class AnotherClass {
    public static void main(String[] args) {
        try{
            anotherMethod();
            fileOpen();
        }
        catch (FileNotFoundException ex)
        {
            System.out.println(ex.getMessage());
        }

        System.out.println("next code run");

    }

    public static void anotherMethod() throws FileNotFoundException {
        fileOpen();
    }


    public static void fileOpen() throws FileNotFoundException {
        String fileName="my-file.txt";
        String currentDir=System.getProperty("user.dir");
        String filePath=currentDir+"/src/com/johurulIslam/main/exceptionhanding/"+fileName;
        File file=new File(filePath);
        FileInputStream fileInputStream=new FileInputStream(file);

    }
}
