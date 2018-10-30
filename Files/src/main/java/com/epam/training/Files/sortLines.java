package com.epam.training.Files;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import basics.util.FileUtils;

public class sortLines {
    public static void main(String args[]) throws IOException
    {


        operation(args[0]);
    }
    public static void operation(String input) throws IOException
    {

        FileUtils file = new FileUtils();

        List<String> data = file.read(input);
        Collections.sort(data);
        for(String string:data) {
            System.out.println(string);

        }
    }
}
