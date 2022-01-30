package javaIO;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class ByteExam04 {
    public static void main(String[] args) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"))) {
            int i = dis.readInt();
            boolean b = dis.readBoolean();
            double pi = dis.readDouble();

            System.out.println(i);
            System.out.println(b);
            System.out.println(pi);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
