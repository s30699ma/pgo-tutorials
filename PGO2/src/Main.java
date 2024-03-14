import java.util.Scanner;
import java.time.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj miasto: ");
        String miasto = scanner.next();

        System.out.println("Podaj wiek: ");
        int wiek = scanner.nextInt();
        String data = LocalDate.now().getDayOfWeek().name();

        double cenabiletu = 40;
        int znizka = 0;

        if (wiek < 10) {
            znizka = 100;
        } else if (wiek >= 10 && wiek <= 18) {
            znizka += 50;
        }

        if (miasto.equals("Warszawa")) {
            znizka += 10;
        }

        if (data.equals("czwartek")) {
            znizka = 100;
        }

        cenabiletu -= (cenabiletu * znizka * 0.01);

        System.out.println("Data: " + miasto + ", " + wiek + " lat, " + data );
        System.out.println(" Cena biletu: " + cenabiletu + "PLN");
        System.out.println("Znizka: " + znizka + " %");
    }
}
