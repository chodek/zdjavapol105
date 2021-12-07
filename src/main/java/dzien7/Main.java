package dzien7;



public class Main {


    public static void main(String[] args) {


        Dog burek = new Dog();

        String something = burek.aport();
        System.out.println(something);

        burek.bark(); // <- obiekty potrafia korzystac z metod niestatycznych
        // burek.introdduce... <- obiekty nie potrafia korzystac z metod statycznych

        Dog.introduceYourClass(); // ale klasy potrafia korzystac z metod statycznych




        Dog azor = new Dog(10, "Azor", "Black");



        burek.age = 5;

        burek.name = "Burek";

        burek.colour = "Yellow";

        azor.introduceYourself();
        burek.introduceYourself();




    }
}
