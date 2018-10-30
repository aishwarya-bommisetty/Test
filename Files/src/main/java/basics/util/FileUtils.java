package basics.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {

    public List<String> read(String path) throws IOException {
        List<String> result = new ArrayList<String>();
        if(!FileExists(path)) {
            throw new FileNotFoundException();
        }
        File file = new File(path);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String temp;
        while((temp = bufferedReader.readLine()) != null) {
          result.add(temp);
        }
        bufferedReader.close();
        return result;
      }
    public void write(String fileName, List<String> content) throws IOException {
        PrintWriter printWriter = new PrintWriter(new FileWriter(fileName, true));
        for(String str:content)
        {
        printWriter.append(str);
        printWriter.println();
        }
        printWriter.flush();
        printWriter.close();
      }
    public void write(String fileName, String content) throws IOException {
        PrintWriter printWriter = new PrintWriter(new FileWriter(fileName, true));
        printWriter.append(content);
        printWriter.flush();
        printWriter.close();
      }
    public void overWrite(String fileName, List<String> content) throws IOException {
        PrintWriter printWriter = new PrintWriter(new FileWriter(fileName));
        for(String str:content)
        {
        printWriter.append(str);
        printWriter.println();
        }
        printWriter.flush();
        printWriter.close();
      }
    public void overWrite(String fileName, String content) throws IOException {
        PrintWriter printWriter = new PrintWriter(new FileWriter(fileName));
        printWriter.append(content);
        printWriter.println();

        printWriter.flush();
        printWriter.close();
      }
    public boolean FileExists(String path)
    {
        File file = new File(path);
        return file.exists();
    }
    public String readToString(String path) throws IOException {

        List<String> data = read(path);
        String result = "";
        for(int i=0;i<data.size();i++)
        {
            result+=data.get(i);
            if(i<data.size())
            {
                result+="\\n";
            }
        }
        return result;
    }
}


