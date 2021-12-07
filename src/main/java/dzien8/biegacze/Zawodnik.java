package dzien8.biegacze;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Zawodnik {
    String imie;
    String identyfikator;
    double predkoscMin;
    double predkoscMax;
    double pokonanaOdleglosc;

    public Zawodnik(String imie, String identyfikator, double predkoscMin, double predkoscMax, double pokonanaOdleglosc) {
        this.imie = imie;
        this.identyfikator = identyfikator;
        this.predkoscMin = predkoscMin;
        this.predkoscMax = predkoscMax;
        this.pokonanaOdleglosc = pokonanaOdleglosc;
    }

    public void biegnij(){
        Random random = new Random();

        double losowaOdlegloscWGodzine = random.nextDouble() * (predkoscMax - predkoscMin) + predkoscMin;
        pokonanaOdleglosc += losowaOdlegloscWGodzine;
    }


    public void przedstawSie() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
      "Superman".substring(5,8);

        return "Zawodnik{" +
                "imie='" + imie + '\'' +
                ", identyfikator='" + identyfikator + '\'' +
                ", predkoscMin=" + predkoscMin +
                ", predkoscMax=" + predkoscMax +
                ", pokonanaOdleglosc=" + pokonanaOdleglosc +
                '}';
    }
}
