package book;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @author JYG
 * @description
 * @create 2021−05-06 10:32 上午
 */
public class TestUnSafe {
    //获取unsafe的实例
    static final Unsafe unsafe;//= Unsafe.getUnsafe ();

    static final long stateOffset;

    private volatile long state = 0;

    static {
        try {
            //stateOffset =  unsafe.objectFieldOffset(TestUnSafe.class.getDeclaredField("state"));
            Field theUnsafe = Unsafe.class.getDeclaredField("theUnsafe");
            //设置为可存取
            theUnsafe.setAccessible(true);
            //获取该变量的值
            unsafe = (Unsafe)theUnsafe.get(null);
            //获取偏移量
            stateOffset =  unsafe.objectFieldOffset(TestUnSafe.class.getDeclaredField("state"));
        }catch (Exception e){
            System.out.println(e.getLocalizedMessage());
            throw new Error(e);
        }

    }

    public static void main(String[] args) {
        TestUnSafe test = new TestUnSafe();

        boolean b = unsafe.compareAndSwapInt(test, stateOffset, 0, 1);
        System.out.println(b);
    }
    
}
