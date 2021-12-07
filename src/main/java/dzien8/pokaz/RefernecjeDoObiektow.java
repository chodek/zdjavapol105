package dzien8.pokaz;

import dzien7.Dog;

public class RefernecjeDoObiektow {

    public static void main(String[] args) {
        int wiek = 10;
        Dog someDog = new Dog();



        someDog.age = 10;

        System.out.println(someDog.age);

        methodX(someDog);

        System.out.println(someDog.age);

    }
    public static void methodX(Dog doggy){

        doggy.age = 99;
    }



}
