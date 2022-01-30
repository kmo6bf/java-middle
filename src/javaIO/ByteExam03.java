package javaIO;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam03 {
    public static void main(String[] args) {
        // 자동으로 close 시키기
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt"));) {
            out.writeInt(100);
            out.writeBoolean(false);
            out.writeDouble(3.141592);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
