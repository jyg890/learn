package jvm;

/**
 * @author JYG
 * @description
 * @create 2021β05-08 3:18 δΈε
 */
public class Fu {
    static int i = method();
    int j = test();

    static {
        System.out.println("(1)");
    }

    {
        System.out.println("(2)");
    }

    public Fu() {
        System.out.println("(3)");
    }

    protected int test(){
        System.out.println("(4)");
        return 0;
    }

    private static int method(){
        System.out.println("(5)");
        return 0;
    }
}
