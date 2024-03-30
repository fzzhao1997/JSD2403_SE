package io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc= new Scanner(System.in);
        FileOutputStream fileOutputStream = new FileOutputStream("./note2.txt");
        PrintWriter note = new PrintWriter(fileOutputStream,true);//true 每当调用println方法,就会flush,第一个实参是流才能用
        while (true) {
            System.out.println("请输入内容,单独输入exit退出:");
            String input = sc.nextLine();
            if (input.equals("exit")) {
                note.close();
                break;
            } else {
                note.println(input);

            }
        }
    }
}
