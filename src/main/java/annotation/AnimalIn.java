package annotation;

/**
 * @author JYG
 * @description
 * @create 2021−01-06 2:44 下午
 */
public interface AnimalIn {
    //设置名字
    void setName(String name);
    //获取名字
    String getName();
    //叫声
    void say();
    //获取习性
    void getProperty();
    //设置习性
    void setProperty(String Property);
}
