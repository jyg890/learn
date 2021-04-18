package javaTuXin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;

/**
 * @author JYG
 * @description
 * @create 2021−03-30 3:18 下午
 */
public class Test {

    public static void main(String[] args) {
//        long l = System.currentTimeMillis();
//        Date date = new Date(l);
//        System.out.println(l);
//        System.out.println(date);

        long l = System.nanoTime();
        Date date = new Date(l / 1_000_000);
        System.out.println(l);
        System.out.println(date);



    }
}
