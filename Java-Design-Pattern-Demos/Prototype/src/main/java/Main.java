public class Main {
    public static void main(String[] args) {
        PrototypeClass prototype = new PrototypeClass();
        prototype.name = "Tom";
        prototype.age = "18";
        prototype.sex = "boy";

        try {
            PrototypeClass prototypeClone = (PrototypeClass) prototype.clone();
            System.out.println(prototypeClone.name);
            System.out.println(prototypeClone.age);
            System.out.println(prototypeClone.sex);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }

}
