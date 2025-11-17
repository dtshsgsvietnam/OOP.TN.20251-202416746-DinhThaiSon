package com.hust.kstn.garbage;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class GarbageCreator {

	public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\Lenovo\\OOP.TN.20251-202416746-DinhThaiSon\\AimsProject\\answers\\method_overloading_answer.txt";
        byte[] inputBytes = {0};
        long startTime, endTime;

        inputBytes = Files.readAllBytes(Paths.get(fileName));
        startTime = System.currentTimeMillis();
        String outputString = "";
        for (byte b : inputBytes) {
            outputString += (char)b;
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }

}
