package lezione8Adecco2Set;

import java.util.Random;
import java.util.Scanner;


/* 1- Dato un ingresso ( SCANNER) 
*    un numero che deve != 0
*    (controllare con un semaforo)
*    
*    e dato un vettore di double gia'
*    inizializzato.
*    
*    modificare il vettore moltiplicando
*    tutti gli elementi del vettore
*    per il numero inserito.
*/

public class esercizio1Vettori {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		int number ;
		Random random=new Random();
		
		do {
			System.out.println("inserisci ");
			number=key.nextInt();
			
		} while (number==0);
		
		double[] vett = new double[10];
		
		for (int i = 0; i < vett.length; i++) {
			
			vett[i]=random.nextDouble(100);
			System.out.println("stampa "+(i+1)+":"+vett[i]);
			vett[i]*=number;
			System.out.println("stampa "+(i+1)+":"+vett[i]);
			
		}
		
		key.close();

	}

}
