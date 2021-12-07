package dzien9.immutables;

import dzien7.Dog;

public class PokazImmutable {
    public static void main(String[] args) {
        String any = "ALA";
        System.out.println("W metodzie main, przed wywolaniem x() " + any.toLowerCase());
        System.out.println("W metodzie main, przed wywolaniem x() " + any);
        any = x(any);


        Dog doggy = new Dog();
        doggy.setAge(10);
        changeDog(doggy);
        System.out.println(doggy.age);
    }

    private static void changeDog(Dog someDog) {
        someDog.setAge(15);
    }

    public static String x(String something) {
        System.out.println(something.toLowerCase());
        System.out.println(something);
        return something;
    }

}
