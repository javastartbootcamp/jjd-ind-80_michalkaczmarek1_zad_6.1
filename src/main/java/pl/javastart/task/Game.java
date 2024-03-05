package pl.javastart.task;

import java.util.Scanner;

class Game {
    private final Scanner scanner = new Scanner(System.in);

    void start() {
        int number = 0;
        do {
            if (number != 0) {
                validNumber(number);
            }

            System.out.println("Podaj liczbe");
            number = scanner.nextInt();
        } while (!((number >= 100 && number <= 200) && number % 3 == 0));

        System.out.println("Twoja liczba jest ok");
    }

    private void validNumber(int number) {
        if (number < 100) {
            System.out.println("Podana liczba jest za mała");
        } else if (number > 200) {
            System.out.println("Podana liczba jest za duza");
        } else {
            System.out.println("Liczba nie jest podzielna przez 3");
        }
    }
}
