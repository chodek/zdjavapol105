package dzien8.biegacze;

public class Wyscig {
    public static void main(String[] args) {
        Zawodnik pierwszy = new Zawodnik("A", "A", 1.0, 2.0, 0);
        Zawodnik drugi = new Zawodnik("B", "B", 0.5, 3.0, 0);
        Zawodnik trzeci = new Zawodnik("C", "C", 0.0, 5.0, 0);


        do {
            pierwszy.biegnij();
            drugi.biegnij();
            trzeci.biegnij();
        } while (pierwszy.pokonanaOdleglosc < 50 && drugi.pokonanaOdleglosc < 50 && trzeci.pokonanaOdleglosc < 50);

        if (pierwszy.pokonanaOdleglosc > 50){
            pierwszy.przedstawSie();
        }
        if (drugi.pokonanaOdleglosc > 50){
            drugi.przedstawSie();
        }
        if (trzeci.pokonanaOdleglosc > 50){
            trzeci.przedstawSie();
        }

    }
}
