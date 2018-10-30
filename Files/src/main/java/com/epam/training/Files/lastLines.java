package com.epam.training.Files;

import java.io.IOException;
import java.util.List;

import com.epam.training.Exceptions.LineIndexOutOfBoundsException;

import basics.util.FileUtils;

public class lastLines {
    public static void main(String args[]) throws IOException, LineIndexOutOfBoundsException
    {
//        operation("C:\\Users\\Aishwarya_Bommisetty\\Desktop\\input.txt", "C:\\Users\\Aishwarya_Bommisetty\\Desktop\\output.txt");
        int N=5;
        if(args.length>2)
        {
            N=Integer.parseInt(args[2]);
        }
        operation(args[0], args[1], N);
    }
    public static void operation(String input, String output, int lines) throws IOException, LineIndexOutOfBoundsException
    {

        FileUtils file = new FileUtils();
        List<String> data = file.read(input);
        int length=data.size();
        if(lines>length) {
            throw new LineIndexOutOfBoundsException("lines requested are more than the number of lines in the file");
        }
        if(lines<0) {
            throw new LineIndexOutOfBoundsException("lines requested cannot be negative");
        }
        for(int i=lines-1;i<length;i++) {
            file.write(output, data.get(i));
        }

    }
}
