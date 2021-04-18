package annotation;

import java.lang.annotation.*;

/**
 * @author JYG
 * @description
 * @create 2021−01-06 2:37 下午
 */
@Documented
@Target({ElementType.FIELD,ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Annotation {

    String value() default "kim";

    String Property() default "kong";
}
