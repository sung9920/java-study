package chapter04.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ScannerPhoneList {

    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            File file = new File("phone.txt");

            if(!file.exists()) {
                System.out.println("file not found");
                return;
            }

            System.out.println("========== 파일정보 ============");
            System.out.println(file.getAbsolutePath());
            System.out.println(file.length() + "Bytes");

            long lastModified = file.lastModified();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            System.out.println(sdf.format(new Date(lastModified)));

            System.out.println("========== 전화번호 ============");
            scanner = new Scanner(file);

            while(scanner.hasNextLine()) {
                String name = scanner.next();
                String phone1 = scanner.next();
                String phone2 = scanner.next();
                String phone3 = scanner.next();

                System.out.println(name + "	: " + phone1 + "-" + phone2 + "-" + phone3);
            }

        } catch(FileNotFoundException e) {
            System.out.println("file not found: " + e);
        } finally {
            if(scanner != null) {
                scanner.close();
            }
        }
    }

}