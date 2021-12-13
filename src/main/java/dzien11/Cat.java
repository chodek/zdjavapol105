package dzien11;

public class Cat{

    private int age;
    protected String name;

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if (age > 15){
            System.out.println("koty tyle nie zyja!");
            return;
        }
        this.age = age;
    }




    public Cat(int age) {
        this.age = age;
    }




}


