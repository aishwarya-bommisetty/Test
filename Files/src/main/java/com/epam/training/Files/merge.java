package com.epam.training.Files;

import java.io.IOException;
import java.util.List;

import basics.util.FileUtils;

public class merge {
    public static void main(String args[]) throws IOException
    {
//        operation("C:\\Users\\Aishwarya_Bommisetty\\Desktop\\input.txt", "C:\\Users\\Aishwarya_Bommisetty\\Desktop\\output.txt");

        operation(args[0], args[1], args[2]);
    }
    public static void operation(String input1, String input2, String output) throws IOException
    {

        FileUtils file = new FileUtils();
        List<String> data1 = file.read(input1);
        List<String> data2 = file.read(input2);
        if(file.FileExists(output))
        {

            String reply = System.console().readLine("the file: "+output+" already exists. Do you want to replace this file?  enter Y/N");
            if(reply.equals("Y"))
            {
                file.write(output, data1);
                file.write(output, data2);
            }
            else
            {
                return;
            }
        }
        file.write(output, data1);
        file.write(output, data2);

    }
}
