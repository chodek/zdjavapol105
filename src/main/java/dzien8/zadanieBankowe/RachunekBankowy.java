package dzien8.zadanieBankowe;

public class RachunekBankowy {
    String numerKonta;
    double iloscSrodkowNaKoncie;
    String imieWlasciciela;
    String nazwiskoWlasciciela;

    public RachunekBankowy(
            String numerKonta,
            double iloscSrodkowNaKoncie,
            String imieWlasciciela,
            String nazwiskoWlasciciela) {
        this.numerKonta = numerKonta;
        this.iloscSrodkowNaKoncie = iloscSrodkowNaKoncie;
        this.imieWlasciciela = imieWlasciciela;
        this.nazwiskoWlasciciela = nazwiskoWlasciciela;
    }

    public void wypiszStanKonta(){
        System.out.println(this.iloscSrodkowNaKoncie);
    }

    public void wykonajPrzelewPrzychodzacy(double kwota) {
        this.iloscSrodkowNaKoncie += kwota;

    }

    public void wykonajPrzelewWychodzacy(double kwota) {
        if (this.iloscSrodkowNaKoncie >= kwota) {
            this.iloscSrodkowNaKoncie -= kwota;
        } else {
            System.out.println("Nie udalo sie zrobic przelewu, nie ma wystarczajcej kwoty na koncie!");
        }
    }


}
