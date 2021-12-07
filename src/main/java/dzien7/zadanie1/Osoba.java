package dzien7.zadanie1;

import java.util.ArrayList;
import java.util.List;

public class Osoba {
    String imie;
    int rokUrodzenia;


    public Osoba(String imie, int rokUrodzenia) {
        this.imie = imie;
        this.rokUrodzenia = rokUrodzenia;
    }

    public Osoba() {
    }

    public void przedstawSie() {
        System.out.println("Czesc! Mam na imie " + this.imie + " i mam " + (2021 - this.rokUrodzenia) + " lat.");
    }


}
