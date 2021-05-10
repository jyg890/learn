package jvm;

/**
 * @author JYG
 * @description
 * @create 2021−05-08 3:22 下午
 */
public class Zi extends Fu {

    static int i = method();
    int j = test();

    static {
        System.out.println("(6)");
    }

    {
        System.out.println("(7)");
    }

    public Zi() {
        System.out.println("(8)");
    }


    //子类只可以重写父类中对外可见的方法  如子类和父类都是private的话 那子类的test和父类的将毫无关系
    public int test(){
        System.out.println("(9)");
        return 0;
    }

    private static int method(){
        System.out.println("(10)");
        return 0;
    }

    public static void main(String[] args) {
        Zi zi = new Zi();
        Zi zi1 = new Zi();
    }
}
