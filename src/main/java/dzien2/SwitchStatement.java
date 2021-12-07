package dzien2;

public class SwitchStatement {
    public static void main(String[] args) {
        int someInt = 123;

        switch (someInt) {
            case 200:
                System.out.println("Loo jezu jaka duza liczba!");
                System.out.println("cokolwiek");
                // ile operacji zechcemy
                break;
            case 100:
                System.out.println("No taka srednia liczba");
                break;
            case 10:
                System.out.println("Ale mala liczba");
                break;
            default:
                System.out.println("Nie znam tej liczby");
                break;
        }


        String imie = "ania";

        switch (imie) {
            case "Ania":
                System.out.println("witaj ania!");
                break;
            case "bartek":
                System.out.println("witaj bartek!");
                break;
            default:
                System.out.println("Witaj ktos!");
                break;
        }
    }
}
