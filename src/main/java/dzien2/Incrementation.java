package dzien2;

public class Incrementation {
    public static void main(String[] args) {

        System.out.println("IntArrayHelper postinkrementacji");
        int value = 10;
        System.out.println(value);
        System.out.println(value++);
        System.out.println(value);

        System.out.println("IntArrayHelper preinkrementacji");
        value = 10;
        System.out.println(value);
        System.out.println(++value);
        System.out.println(value);



        int someValue = 123;
        someValue *= 100;
        System.out.println(someValue);

    }
}
