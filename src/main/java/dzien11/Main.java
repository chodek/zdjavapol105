package dzien11;

public class Main {
    public static void main(String[] args) {

        Cat klakier = new Cat(10);

        klakier.setAge(15);

        klakier.name = "asda";

        System.out.println(klakier.getAge());

        klakier.setAge(99);

        System.out.println(klakier.getAge());

    }
}
