import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1- Inserire 3 numeri e determinare qual è il più grande dei 3!

        System.out.println("Inserisci il primo numero");
        int x = scanner.nextInt();
        System.out.println("Inserisci il secondo numero");
        int y = scanner.nextInt();
        System.out.println("Inserisci il terzo numero");
        int z = scanner.nextInt();
        int k= scanner.nextInt();

        if (x > y && x > z) {
            System.out.println(x + " è il numero più grande!");
        } else if (y > x && y > z) {
            System.out.println(y + " è il numero più grande!");
        } else {
            System.out.println(z + " è il numero più grande!");
        }


        // 2- Scrivere un programma che chieda 2 numeri e un'operazione e stampare il risultato

        System.out.println("Inserisci il primo numero");
        int a = scanner.nextInt();
        System.out.println("Inserisci il secondo numero");
        int b = scanner.nextInt();
        System.out.println("Inserisci 1 per addizione, 2 per sottrazione, 3 per moltiplicazione o 4 per divisione");
        int operazione = scanner.nextInt();

        int risultato = 0;

        switch (operazione) {
            case 1:
                risultato = a + b;
                break;
            case 2:
                risultato = a - b;
                break;
            case 3:
                risultato = a * b;
                break;
            case 4:
                risultato = a / b;
                break;
        }

//        int risultato = switch (operazione) {
//            case 1 -> a + b;
//            case 2 -> a - b;
//            case 3 -> a * b;
//            case 4 -> a / b;
//            default -> 0;
//        }; VERSIONE MIGLIORATA DELLO SWITCH

        System.out.println("il risultato è: " + risultato);

        // 3- programma che chiede numeri finché non si inserisce 0 e deve restituire la conta dei numeri pari!

        int num = 1;
        int contatore = 0;

        while (num != 0) {
            System.out.println("Inserisci un numero diverso da 0, o se vuoi fermare il programma, inserisci 0!");
            num = scanner.nextInt();
            if (num % 2 == 0) {
                contatore++;
                System.out.println("Il numero inserito è pari, i numeri pari al momento sono: " + contatore);
            } else {
                System.out.println("Il numero inserito è dispari");
            }

        }

        // 4- programma che chiede di inserire 10 numeri da salvare in un array, calcolare e stampare la media e il numero più grande!

        int[] numbers = new int[10];
        int somma = 0;
        int maggiore = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Inserisci un numero");
            numbers[i] = scanner.nextInt();
            somma += numbers[i];

            if (i == 0) {
                maggiore = numbers[i];
            } else if (numbers[i] > maggiore) {
                maggiore = numbers[i];
            }

        }

        int media = somma / numbers.length;

        System.out.println("La media dei numeri inseriti è: " + media);
        System.out.println("il numero più grande è: " + maggiore);

        // 5- Creare una classe Libro, 2 istanze di Libro e stamparne i dettagli!
        // (Per stampare le proprietà di un oggetto bisogna creare un metodo nella classe da cui è istanziato!)

//        Creo le Istanze dalla classe Libro
        Libro HarryPotter = new Libro("Harry Potter e La Pietra Filosofale", "J. K. Rowling", 304);
        Libro IlSignoreDegliAnelli = new Libro("Il Signore Degli Anelli", "J. R. R. Tolkien", 1408);

// Uso il metodo print() della Classe Libro per stampare i dettagli delle istanze!
        HarryPotter.print();

        IlSignoreDegliAnelli.print();

        // 5- Creare una classe ContoBancario, numero di conto randomico, aggiungere metodi per depositare e prelevare denaro,
        // uno per stampare il saldo, crearne un'istanza e testare i metodi

        ContoBancario conto = new ContoBancario();
        System.out.println("Numero Conto: " + conto.numeroConto);
        conto.saldoAttuale();
        conto.deposita(50);
        conto.preleva(20);
        conto.preleva(20);
        conto.preleva(20);
        conto.saldoAttuale();

        // 6- Crea una classe studente, un metodo per calcolare la media dei suoi voti e uno per stampare i dettagli dello studente
        // compresa la media!

        Studente studente1 = new Studente("Danilo", "Fumuso", new int[]{10, 9, 6, 8});
        Studente studente2 = new Studente("Paolo", "Di Bella", new int[]{5, 7, 6, 10});

        studente1.print();
        studente2.print();
    }
}