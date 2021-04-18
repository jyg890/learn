package annotation;

/**
 * @author JYG
 * @description
 * @create 2021−01-06 2:41 下午
 */
public class TestImp implements AnimalIn{

    @Annotation(value = "bob")
    public String name;

    private String Property;

    public TestImp() {
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    @Annotation(Property = "战士")
    public void say() {
        System.out.println("小狗:汪汪汪汪.....");
    }

    @Override
    public void getProperty() {
        System.out.println(this.name + this.Property);
    }

    @Override
    @Annotation(Property = "战士")
    public void setProperty(String Property) {
        this.Property = Property;
    }
}
