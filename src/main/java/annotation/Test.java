package annotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author JYG
 * @description
 * @create 2021−01-06 2:48 下午
 */
public class Test {
    public static void main(String[] args) throws Exception {
        //获取类上注解
        Class <TestImp> testImpClass = TestImp.class;
        Annotation annotationOnClass = testImpClass.getAnnotation(Annotation.class);
        if(null == annotationOnClass){
            System.out.println("无");
        }else {
            System.out.println(annotationOnClass.value());
        }


        //获取变量上注解
        Field name = testImpClass.getField("name");
        Annotation annotationOnField = name.getAnnotation(Annotation.class);
        System.out.println(annotationOnField.value());

        //获取方法上注解
        Method method = testImpClass.getMethod("say",null);
        Annotation annotationOnMethod = method.getAnnotation(Annotation.class);
        System.out.println(annotationOnMethod.Property());

    }
}
