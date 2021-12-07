package dzien7;

public class Dog {
    public int age;
    public String name;
    public String colour;

    public Dog(int age, String name, String colour){
        this.age = age;
        this.name = name;
        this.colour = colour;
    }

    public Dog() {

    }

    public void setAge(int age){
        this.age = age;
    }

    // dwie niestatyczne metody - naleza do obiektow
    public void bark(){
        System.out.println("Hau! Hau!");
    }

    public String aport(){
        return "branch";
    }

    public void introduceYourself(){
        System.out.println(age);
        System.out.println(name);
        System.out.println(colour);
    }


    // metoda statyczna nalezy do klasy
    public static String introduceYourClass(){
        return "Dog";
    }

}
