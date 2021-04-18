package question01;

import java.util.Arrays;

/**
 * @author JYG
 * @description
 * @create 2021−01-07 3:31 下午
 */
public class Test02 {

    public static void main(String[] args) {

//        for(int i = 2;i <=50;i++){
//            boolean flag = true;
//            for (int j = 2;j < i;j++){
//                if(i % j == 0){
//                    flag = false;
//                    break;
//                }
//            }
//            if(flag){
//                System.out.println(i);
//            }
//        }

        int i = 6;
        i+=i-1;
        System.out.println(i);


//        int i = 1;
//        String str = "hello";
//        Integer num = 200;
//        int [] arr = {1,2,3,4,5};
//        MyData myData = new MyData();
//
//        change(i,str,num,arr,myData);
//
//        System.out.println("i = " + i);
//        System.out.println("str = " + str);
//        System.out.println("num = " + num);
//        System.out.println("arr = " + Arrays.toString(arr));
//        System.out.println("myData.a = " + myData.a);
    }



    public static void change(int j,String s,Integer n,int[] a,MyData m) {
        j += 1;
        s += "world";
        n += 1;
        a[0] += 1;
        m.a += 1;


    }

}
class MyData{
    int a = 10;
}
