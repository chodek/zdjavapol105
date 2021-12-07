package dzien8.zadanieBankowe;

public class Main {


    public static void main(String[] args) {

        int wiek;

        String imie;

        RachunekBankowy czyjs;

        //sprwadzDzialanieRanchunkowBankowych();
        sprawdzDzialanieBanku();

    }

    private static void sprwadzDzialanieRanchunkowBankowych() {
        RachunekBankowy rachuneczek = new RachunekBankowy(
                "123",
                200,
                "Jan",
                "Kowalski");

        rachuneczek.wypiszStanKonta();
        rachuneczek.wykonajPrzelewPrzychodzacy(100);
        rachuneczek.wypiszStanKonta();

        rachuneczek.wykonajPrzelewWychodzacy(250);
        rachuneczek.wypiszStanKonta();

        rachuneczek.wykonajPrzelewWychodzacy(100);
        rachuneczek.wypiszStanKonta();
    }

    private static void sprawdzDzialanieBanku() {
        RachunekBankowy agaty = new RachunekBankowy(
                "345",
                200,
                "Agata",
                "Kowalska");

        RachunekBankowy piotra = new RachunekBankowy(
                "678",
                1000,
                "Piotr",
                "Nowak");

        RachunekBankowy[] rachunki = new RachunekBankowy[]{agaty, piotra};

        Bank mbank = new Bank("mBank", rachunki);


        agaty.wypiszStanKonta();
        piotra.wypiszStanKonta();

        mbank.wykonajPrzelew("678","345", 500);

        agaty.wypiszStanKonta();
        piotra.wypiszStanKonta();







    }


}
