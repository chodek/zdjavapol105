package dzien16.statycznoscPowtorka;

public class Kolejnosc {

    static {
        System.out.println("dzien dobry, ze statycznej sekcji kodu");
    }

    public Kolejnosc(){
        System.out.println("Dzien dobry, z konstruktora!");
    }

    public void powitaj(){
        System.out.println("dzien dobry, z metody niestatycznej!");
    }



}
