package dzien16.statycznoscPowtorka;

public class Biuro {

    private static int iloscOsobWBiurze;

    private String nazwa;
    private String adres;

    public Biuro(String nazwa, String adres) {
        this.nazwa = nazwa;
        this.adres = adres;
    }

    public void ktosWchodziDoBiura(){
        iloscOsobWBiurze++;
    }

    public void ktosWychodziZBiura(){
        iloscOsobWBiurze--;
    }

    public static void opiszBiuro(){
        System.out.println("Biuro to miejsce pracy tysiecy ludzi, z reguly nieszczesliwych");
    }

    @Override
    public String toString() {
        return "Biuro{" +
                "nazwa='" + nazwa + '\'' +
                ", adres='" + adres + '\'' +
                ", iloscOsobWBiurze=" + iloscOsobWBiurze +
                '}';
    }
}
