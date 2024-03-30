package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ISRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("osw.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        int read;
        while ((read = inputStreamReader.read())!=-1) {
            char reader = (char) read;
            System.out.print(reader);
        }
        System.out.println("读写完毕");
    }
}
