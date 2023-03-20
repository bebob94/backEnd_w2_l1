package gestione_errori_es2;

import java.util.Scanner;

public class runnable {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        double km, litri, kmPerLitro;

        System.out.println("Inserisci il numero di km percorsi: ");
        km = input.nextDouble();
        System.out.println("Inserisci il numero di litri di carburante consumati: ");
        litri = input.nextDouble();

        try {
            if (litri == 0) {
                throw new Exception("Divisione per zero: il numero di litri non può essere uguale a 0!");
            } else {
                kmPerLitro = km / litri;
                System.out.printf("Il numero di km/litro percorsi è: "+  kmPerLitro + " km/litro");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}