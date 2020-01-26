package com.salman.springapp;

import org.springframework.stereotype.Component;

import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

@Component("newWorld")
public class FileFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        String[] arr = new String[0];
        int index = 0;
        try {
             arr = getFortunesFromFile();
             index = number.nextInt(arr.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arr[index];
    }

    private String[] getFortunesFromFile() throws IOException {
        File file = new File("C:\\Users\\Salman\\OneDrive\\Desktop\\fortune.txt");
        Scanner sc = new Scanner(file);
        String string = null;
        while (sc.hasNextLine()){
            string = sc.nextLine();
        }
        assert string != null;
        return string.split(Pattern.quote("."));
    }

    private Random number = new Random();
}

