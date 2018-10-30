package com.epam.training.Files;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import basics.util.FileUtils;

public class Encrypt {
  Map<String, String> generatorRule;
  public Encrypt() {
    generatorRule = new HashMap<String, String>();
    generatorRule.put("s", "Z");
    generatorRule.put("ck", "X");
    generatorRule.put("a", "@");
    generatorRule.put("e", "3");
    generatorRule.put("i", "1");
    generatorRule.put("o", "0");
    generatorRule.put("u", "V");
    generatorRule.put("f", "ph");
    generatorRule.put("g", "9");
    generatorRule.put("y", "j");
    generatorRule.put("t", "+");
    generatorRule.put("!", "1");
  }

  public void encrypt(String inputFile) throws IOException {
    FileUtils file = new FileUtils();
    String data = file.readToString(inputFile);
    for ( String key: generatorRule.keySet()) {
      data = data.replace(key, generatorRule.get(key));
    }
    char[] tempData = data.toCharArray();
    for(int i = 3; i < data.length(); i = i + 3) {
      if(Character.isUpperCase(data.charAt(i))) {
        tempData[i] = Character.toLowerCase(tempData[i]);
      } else {
        tempData[i] = Character.toUpperCase(tempData[i]);
      }
    }
    String result = new String(tempData);
    System.out.println(result);
  }


  public static void main(String args[]) throws IOException {
    Encrypt s = new Encrypt();
    s.encrypt("C:\\Users\\Aishwarya_Bommisetty\\Desktop\\input.txt");

  }


}