package dzien2;

public class ComparingStrings {
    public static void main(String[] args) {

        String one = "cos";
        String two = "cos";

        System.out.println(one == two);
        System.out.println(one.equals(two));


        String createdOne = new String("cos");
        String createdTwo = new String("cos");

        System.out.println(createdOne == createdTwo);
        System.out.println(createdOne.equals(createdTwo));



    }
}
