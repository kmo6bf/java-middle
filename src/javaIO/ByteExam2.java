package javaIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam2 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("src/javaIO/ByteExam1.java");
            fos = new FileOutputStream("byte02.txt");

            int readCount = -1;
            // 1byte 씩 읽던 방식을 512byte 씩 읽도록 변경해본다.
            byte[] buffer = new byte[512];
            while ((readCount = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, readCount);
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
