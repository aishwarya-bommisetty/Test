package com.epam.training.Files;

import java.util.List;
import java.io.IOException;

import basics.util.FileUtils;

public class NumberOfOccurences {
    public static void main(String[] args) throws IOException {
      System.out.println(countOfString(args[0], args[1]));
    }

    private static int countOfString(String fileName, String searchString) throws IOException {
      FileUtils fileUtil = new FileUtils();
      List<String> fileContent = fileUtil.read(fileName);
      int count = 0;
      for (String str : fileContent) {
        if(str.contains(searchString)) {
          count++;
        }
      }
      return count;
    }
  }