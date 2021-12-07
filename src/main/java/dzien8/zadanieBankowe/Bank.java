package dzien8.zadanieBankowe;

public class Bank {
    String nazwa;
    RachunekBankowy[] rachunki;

    public Bank(String nazwa, RachunekBankowy[] rachunki) {
        this.nazwa = nazwa;
        this.rachunki = rachunki;
    }

    public void wykonajPrzelew(
            String numerKontaZ,
            String numerKontaNa,
            double kwotaPrzelewu) {

        RachunekBankowy rachunekZ = null, rachunekNa = null;

        // 1. znalezc konto o numerze "Z" i konto o numerze "Na"

        for (int i = 0; i < rachunki.length; i++) {
            if (rachunki[i].numerKonta.equals(numerKontaZ)) {
                rachunekZ = rachunki[i];
            } else if (rachunki[i].numerKonta.equals(numerKontaNa)) {
                rachunekNa = rachunki[i];
            }
        }

        // 2. Jezeli konta istnieja, sprawdz, czy mozna zabrac pieniadze z "Z"
        if (rachunekZ != null && rachunekNa != null) {
            if (rachunekZ.iloscSrodkowNaKoncie >= kwotaPrzelewu) {
                // Jesli mozna, to wykonaj przelewy
                rachunekZ.wykonajPrzelewWychodzacy(kwotaPrzelewu);
                rachunekNa.wykonajPrzelewPrzychodzacy(kwotaPrzelewu);
            } else {
                System.out.println("Brak srodkow na koncie uzytym do przelewu");
                return;
            }
        } else {
            System.out.println("Nie znaleziono rachunkow!");
            return;
        }
        System.out.println("Dokonalem przelewu!");
    }
}
