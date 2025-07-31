package chapter04.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class StreamChainingPhoneList {

    public static void main(String[] args) {
        BufferedReader br = null;

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

            //1.기반 스트림
            FileInputStream fis = new FileInputStream(file);

            //2.보조 스트림1: byte|byte|byte -> char
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");

            //3.보조 스트림2: char1|char2|char3|char4|\n -> "char1char2char3char4"
            br = new BufferedReader(isr);

            //4. 처리
            String line = null;
            while((line = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(line, "\t ");

                int index = 0;
                while(st.hasMoreElements()) {
                    String token = st.nextToken();

                    System.out.print(token);

                    if(index == 0) { // name
                        System.out.print("	: ");
                    } else if(index == 1) { // 전화번호1
                        System.out.print("-");
                    } else if(index == 2) { // 전화번호2
                        System.out.print("-");
                    } else { // 전화번호3
                        System.out.print("\n");
                    }

                    index++;
                }
            }
        } catch (UnsupportedEncodingException e) {
            System.out.println("error: " + e);
        } catch (IOException e) {
            System.out.println("error: " + e);
        } finally {
            try {
                if(br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}