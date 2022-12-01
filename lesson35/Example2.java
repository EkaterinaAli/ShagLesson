package lesson35;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example2 {
    public static void main(String[] args) {
        final String inputFileName = "lines.txt";
        final String outputFileName = "lines2.txt";
        try( FileReader fr = new FileReader(inputFileName);
             FileWriter fw = new FileWriter(outputFileName)
        )
        {
            BufferedReader br = new BufferedReader(fr);

            String line = null;
            while ((line = br.readLine())!= null){
             char [] buffer = new char [line.length()];
             line.getChars(0,line.length(), buffer, 0);
             for(char c : buffer){
                 if (c == 'e'){
                     fw.write('E');
                 }else{
                     fw.write(c);
                 }
             }
             fw.write(System.getProperty("line.separator"));
            }

        }catch (IOException ex) {

        }
    }
}
