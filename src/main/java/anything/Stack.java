package anything;

import com.sun.org.apache.xpath.internal.operations.String;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

/**
 * @author JYG
 * @description
 * @create 2021−03-11 1:53 下午
 */
public class Stack {
    public static void main(String[] args) {

//        int a = 3;
//        int b = 3;
//
//        try {
//            FileReader fileReader = new FileReader("123");
//
//            //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader());
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        System.out.println(a == b);

//        for (int i = 0; i < 10; i++) {
//            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
//            String format = simpleDateFormat.format(new Date());
//            System.out.println(format + i);
//        }

//        StringBuilder stringBuilder = new StringBuilder("123456,");
////
////        java.lang.String s  = stringBuilder.toString();
////
////        System.out.println(s);

        long l = System.currentTimeMillis();
        Date date = new Date(l);
        System.out.println(l);
        System.out.println(date);
    }


}
