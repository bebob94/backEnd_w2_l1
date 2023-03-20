package gestione_errori_es1;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class runnable {
	private static int[] array = new int[5];
	private static Scanner scanner = new Scanner(System.in);
	private static boolean press0= false;
	
  public static void main(String[] args) {
	  creaArrey();
    while (true) {
      try {
      inserisci();
      if(press0) {
    	  break;
      }
      } catch (Exception e) {
        System.out.println("Errore: " + e.getMessage() + ". Riprova.");
      }
    }
  }
  
//  <<<<<<<<<<<<<<<<<<<FUNZIONE CHE CREA L'ARRAY>>>>>>>>>>>>>>>>>>>
  public static int[] creaArrey() {
	    Random random = new Random(); 
	    for (int i = 0; i < array.length; i++) {
	      array[i] = random.nextInt(10) + 1;
	    }
	    System.out.println("Array iniziale: "+ Arrays.toString(array));
return array;
  }
  
  
//<<<<<<<<<<<<<<<<<<<FUNZIONE CHE MODIFICA L'ARRAY>>>>>>>>>>>>>>>>>>>
  public static boolean inserisci() throws Exception {
	  System.out.println("Inserisci la posizione (da 1 a 5, 0 per uscire): ");
      int posizione = scanner.nextInt();
      if (posizione == 0) {
    press0 = true;
    	 return press0;
      }
      if (posizione < 1 || posizione > 5) {
          throw new Exception("Posizione non valida");
      }
      System.out.println("Inserisci il valore (da 1 a 10): ");
      int valore = scanner.nextInt();
      if (valore < 1 || valore > 10) {
        throw new Exception("Valore non valido");
      }

      array[posizione - 1] = valore;

      System.out.println("Nuovo stato dell'array: " + Arrays.toString(array));
      press0 = false;
	return press0;
  }
}