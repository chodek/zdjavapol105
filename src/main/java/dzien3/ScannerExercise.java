package dzien3;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class ScannerExercise {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Podaj wiek: ");
        int age = myScanner.nextInt();
        System.out.println("Podaj wzrost: ");
        int height = myScanner.nextInt();

        if (age > 12 && height > 140) {
            System.out.println("Gratulacje, mozesz jechac!");
        } else {
            System.out.println("Nie spelniasz wymagan!");
        }

        myScanner.nextLine();
        System.out.println("Podaj imie:");
        String name = myScanner.nextLine();
        System.out.println("Masz na imie: " + name);


        myScanner.nextInt();
        myScanner.nextLine(); // taki zapis zajmie sie 'zjedzeniem' entera



    }
}
