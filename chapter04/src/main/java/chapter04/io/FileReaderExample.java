package chapter04.io;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileReaderExample {

    public static void main(String[] args) {
        Reader in = null;
        InputStream is = null;

        try {
            in = new FileReader("test.txt");
            is = new FileInputStream("test.txt");

            Reader reader = new InputStreamReader(is, StandardCharsets.UTF_8);

            int count = 0;
            int data = -1;

            while((data = in.read()) != -1) {
                System.out.print((char)data);
                count++;
            }

            System.out.println();
            System.out.println("count: " + count);
            System.out.println("===================");

            count = 0;
            data = -1;
            while((data = reader.read()) != -1) {
                System.out.print((char)data);
                count++;
            }
            System.out.println();
            System.out.println("count: " + count);

        } catch (FileNotFoundException e) {
            System.out.println("file not found: " + e);
        } catch (IOException e) {
            System.out.println("error: " + e);
        } finally {
            try {
                if(in != null) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}