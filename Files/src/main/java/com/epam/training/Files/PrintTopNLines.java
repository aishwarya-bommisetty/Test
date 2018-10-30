package com.epam.training.Files;

import java.io.IOException;
import java.util.List;

import com.epam.training.Exceptions.LineIndexOutOfBoundsException;

import basics.util.FileUtils;

public class PrintTopNLines {
    public static void main(String[] args) throws IOException, NumberFormatException, LineIndexOutOfBoundsException {
      int N=5;
      if (args.length == 0) {
        writeTopLines(args[0], args[1], N);
      } else {
        writeTopLines(args[0], args[1], Integer.parseInt(args[2]));
      }
    }

    public static void writeTopLines(String inputFile, String outputFile, int lines) throws IOException, LineIndexOutOfBoundsException {
      FileUtils fileUtil = new FileUtils();
      List<String> fileContent = fileUtil.read(inputFile);
      int length =  fileContent.size();
      if(lines > length) {
          throw new LineIndexOutOfBoundsException("lines requested are more than the number of lines in the file");
      }
      if(lines < 0) {
          throw new LineIndexOutOfBoundsException("lines requested cannot be negative");
      }
      for (int i = 0; i < lines; i++) {
        fileUtil.write(outputFile, fileContent.get(i));
      }
    }
  }

