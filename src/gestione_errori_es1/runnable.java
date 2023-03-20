package gestione_errori_es1;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class runnable {
	
  public static void main(String[] args) {
	  
    int[] array = new int[5];
    Random random = new Random();

    // Inizializza l'array con valori casuali tra 1 e 10
    for (int i = 0; i < array.length; i++) {
      array[i] = random.nextInt(10) + 1;
    }

    // Stampa l'array iniziale
    System.out.println("Array iniziale: "+ Arrays.toString(array));

    Scanner scanner = new Scanner(System.in);

    while (true) {
      try {
        // Chiede all'utente di inserire la posizione e il valore
        System.out.println("Inserisci la posizione (da 1 a 5, 0 per uscire): ");
        int posizione = scanner.nextInt();
        if (posizione == 0) {
          break;
        }
        if (posizione < 1 || posizione > 5) {
          throw new Exception("Posizione non valida");
        }
        System.out.println("Inserisci il valore (da 1 a 10): ");
        int valore = scanner.nextInt();
        if (valore < 1 || valore > 10) {
          throw new Exception("Valore non valido");
        }

        // Aggiorna l'array con il valore inserito dall'utente
        array[posizione - 1] = valore;

        // Stampa il nuovo stato dell'array
        System.out.println("Nuovo stato dell'array: " + Arrays.toString(array));
      } catch (Exception e) {
        // Gestisce l'eccezione e stampa un messaggio di errore
        System.out.println("Errore: " + e.getMessage() + ". Riprova.");
      }
    }
  }
}