package dzien10.regexy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PokazRegexowWKodzie {
    public static void main(String[] args) {
        // part 1 - regex w Javie
        String ala = "Ala   ma  kota.";

        ala.split("\\s"); // podwojny znack backslasha jest potrzbeny zeby Java nie traktowala tego jako specjalny symbol w Stringu

        System.out.println("Czy umiesz wyswietlic takie cos na ekranie: \\n  ?"); // przyklad zastosowania podwojnego backslasha





        // part 2 - klasy Pattern i Matcher

        Pattern wzor = Pattern.compile("(Hello|(World)!?)"); // utworz taki wzorzec

        Matcher znajdywacz = wzor.matcher(ala); // stworz znajdywacza wzoru "wzor" na Stringu "ala"

        Matcher innyZnajdywacz = wzor.matcher(ala); // stworz zaposowy znajdywacz - jesli chcesz

        while(znajdywacz.find()){ // find() - powiedz czy jest jeszcze jakies wystapienie wzorca
            System.out.println(znajdywacz.group()); // group() podaj mi najblizsze wystapienie wzorca
        }

        System.out.println("######");

        //znajdywacz = wzor.matcher("Hey Hop Hello World! Hello"); // potrzebne jesli chcemy przeszukac tekst raz jeszcze
        while(znajdywacz.find()){
            System.out.println(znajdywacz.group());
        }

    }
}
