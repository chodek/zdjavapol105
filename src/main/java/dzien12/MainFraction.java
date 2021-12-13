package dzien12;

public class MainFraction { // byl font 15
    public static void main(String[] args) {
        int c1 = 12;
        int c2 = 23;
        int c3 = 1234;

        System.out.printf("%22s%-22s%-22s\n","asdfghjklasdfg","Column 2","Column 3");
        System.out.printf("%-22d%-22d%-22d\n",c1,c2,c3);




        Fraction one = new Fraction(1, 2);// 1/2
        Fraction two = new Fraction(4, 3);// 4/3

        Fraction three = one.add(two);

        System.out.println(three.toString());

    }
}
