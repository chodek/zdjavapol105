package dzien5;

public class PrzeciazanieMetod {

    public static void main(String[] args) {

        int wynik = dodaj(1.0, 5);

        System.out.println(wynik);


    }


    public static int dodaj(int x, int y) {
        return x + y;
    }

    public static int dodaj(int x, int y, int z) {
        return x + y + z;
    }

    public static int dodaj(int x, int y, int z, int w) {
        return x + y + z + w;
    }

    public static int dodaj(double x, int y) {
        return (int) (x + y);
    }



    public static double dodaj(double x, double y) {
        return x + y;
    }

}
