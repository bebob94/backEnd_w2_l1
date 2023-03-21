package gestione_errori_es2;

import java.util.Scanner;

public class runnable {
	private static Scanner input = new Scanner(System.in);
	private static double km, litri, kmPerLitro;

    public static void main(String[] args) throws Exception {
    	input();
    	
        try {
           calcola();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
//<<<<<<<<<<<<<<<<<<<<<<METODO INPUT>>>>>>>>>>>>>>>>>>>>>>
    public static void input() {
    	 System.out.println("Inserisci il numero di km percorsi: ");
         km = input.nextDouble();
         System.out.println("Inserisci il numero di litri di carburante consumati: ");
         litri = input.nextDouble();
    }
    
//<<<<<<<<<<<<<<<<<<<<<METODO CALCOLA>>>>>>>>>>>>>>>>>>>>>    
    public static void calcola() throws Exception {
    	 if (litri == 0) {
             throw new Exception("Divisione per zero: il numero di litri non può essere uguale a 0!");
         } else {
             kmPerLitro = km / litri;
             System.out.printf("Il numero di km/litro percorsi è: "+  kmPerLitro + " km/litro");
         }
    }
    
}