package com.epam.training.Files;

import java.io.IOException;
import java.util.List;

import basics.util.FileUtils;

public class LinesWithString {
public static void main(String args[]) throws IOException
{
//    operation("C:\\Users\\Aishwarya_Bommisetty\\Desktop\\input.txt", "C:\\Users\\Aishwarya_Bommisetty\\Desktop\\output.txt");
    operation(args[0], args[1], args[2]);
}
public static void operation(String input, String output, String token) throws IOException
{
    FileUtils file = new FileUtils();
    List<String> data = file.read(input);
    for(String string:data) {
        if(string.contains(token))
        {
            file.write(output, data);
        }
    }

}
}
