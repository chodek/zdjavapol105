package dzien16.statycznoscPowtorka;

public class Main {
    public static void main(String[] args) {

        Biuro mordor = new Biuro("mordor", "Domaniewksa");
        Biuro obc = new Biuro("OBC", "Grunwaldzka 472");

        System.out.println(mordor);
        System.out.println(obc);

        mordor.ktosWchodziDoBiura();
        mordor.ktosWchodziDoBiura();
        mordor.ktosWchodziDoBiura();

        obc.ktosWchodziDoBiura();

        Biuro.opiszBiuro();

        System.out.println("######################");
        System.out.println(mordor);
        System.out.println(obc);

    }


}
