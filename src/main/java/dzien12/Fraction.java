package dzien12;

public class Fraction {
    private int nominator; // licznik
    private int denominator; // mianownik

    public Fraction(int nominator, int denominator) {
        this.nominator = nominator;
        if (denominator == 0) {
            System.out.println("Mianownik musi by rozny od 0!");
            throw new ArithmeticException("0 in denominator");
        }
        this.denominator = denominator;
    }


    public Fraction add(Fraction toAdd) {
        if (this.denominator == toAdd.denominator) { //wspolny mianownik
            return new Fraction(this.nominator + toAdd.nominator, this.denominator);
        } else { // rozny mianownik
            int newNominator = this.nominator * toAdd.denominator + toAdd.nominator * this.denominator;
            int newDenominator = this.denominator * toAdd.denominator;
            return new Fraction(newNominator, newDenominator);
        }
    }



    @Override
    public String toString(){
        return nominator + "/" + denominator;
    }

}
