package question01;

/**
 * @author JYG
 * @description
 * @create 2021−01-07 2:45 下午
 */
public class Test01 {

    public static void main(String args[]){

        int i = 1;// i=1
        i = i++;  // i=1                         i自增之后被覆盖  所以还是1     2021-03-11 理解 i先压栈在栈顶为1 局部变量的i自增1为2 后栈顶的1出栈 赋给局部变量i
        int j = i++;//  j = 1 i = 2                 这里的i先赋值再自增 所以j是1 ，i是2
        int h = ++i; // 这种情况下 是变量i先自增 局部变量i为2 然后i压栈 进入栈顶  右边运算结束 此时弹栈 通过=赋值给局部变量i
        System.out.println("i=" + i);
        int k = i + ++i * i++; // （i = 2） + （i = 3） * （i = 3）                //2 + 3 * 3 = 11
        System.out.println("i=" + i);
        System.out.println("j=" + j);
        System.out.println("k=" + k);
        System.out.println("h=" + h);
        int a = 1;
        int b = ++a;
        System.out.println("b=" + b);

//        boolean f = new Object().equals(new Object());
//        new String().equals("123");
//        System.out.println(f);

//        String s = "12345";
//        System.out.println(s.indexOf("2"));
//        System.out.println(s.substring(2,3));


    }
}
