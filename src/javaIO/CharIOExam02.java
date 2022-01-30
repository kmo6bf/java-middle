package javaIO;

import java.io.*;

public class CharIOExam02 {
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter pw = null;


        try {
            br = new BufferedReader(new FileReader("src/javaIO/CharIOExam02.java"));
            pw = new PrintWriter(new FileWriter("test01.txt"));

            String line = null;
            while ((line = br.readLine()) != null) {
                pw.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            pw.close();
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
