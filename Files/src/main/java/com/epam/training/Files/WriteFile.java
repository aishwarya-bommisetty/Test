package com.epam.training.Files;

import java.io.IOException;
import java.util.List;

import basics.util.FileUtils;

public class WriteFile {

    public void writeIntoFile(String outputFile, String inputFile) throws IOException {
      FileUtils fileUtil = new FileUtils();
      List<String> fileContent = fileUtil.read(inputFile);
      fileUtil.overWrite(outputFile, fileContent);
    }
  }