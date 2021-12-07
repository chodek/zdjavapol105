package dzien7.zadanie1;

public class Main {
    public static void main(String[] args) {


        Osoba ania =    new Osoba();
        Osoba andrzej = new Osoba();
        Osoba mariola = new Osoba();

        ania.rokUrodzenia = 2021 - 25;
        ania.imie = "Ania";

        andrzej.rokUrodzenia = 1967;
        andrzej.imie = "Andrzej";

        mariola.rokUrodzenia = 1953;
        mariola.imie = "Mariola";

        ania.przedstawSie();
        andrzej.przedstawSie();
        mariola.przedstawSie();


        System.out.println();
    }
}
