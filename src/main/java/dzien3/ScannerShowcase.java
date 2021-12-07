package dzien3;


import java.util.Scanner;

public class ScannerShowcase {

    public static void main(String[] args) {



        Scanner myScanner = new Scanner(System.in);

        System.out.println("Podaj jakis tekst:");
        String fromUser = myScanner.nextLine();

        System.out.println("Podaj jakas liczbe:");
        int value = myScanner.nextInt();


        System.out.println("Wpisales: " + fromUser + " oraz " + value);




    }
}
