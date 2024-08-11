public class PrototypeClass implements Cloneable{
    String name;

    String sex;

    String age;


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
