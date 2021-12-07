package dzien12;

public class MainFraction {
    public static void main(String[] args) {

        Fraction one = new Fraction(1, 2);// 1/2
        Fraction two = new Fraction(4, 3);// 4/3

        Fraction three = one.add(two);

        System.out.println(three.toString());

    }
}
