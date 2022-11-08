package lezione8Adecco2Set;
/*
* 2 - ESERCIZIO 2 .
* 		Dati 2 vettori che hanno la stessa dimensione
*     (i vettori sono gia' inizializzati )
*     
*     controllare che la dimensione dei 2 vettori sia 
*     uguale con if.
*     
*     creare un terzo array che ha la seguente forma :
*     
*     
*     [    1  ,  4 ,  5 ]
*    
*     [    3 ,   1  , 5 ]
*     
*     
*     [    4 , 5 , 10 ]
*     Terzo vettore somma   
*/

public class Esercizio2Vettore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] vett= {1,4,5};
		int[] vett1= {3,1,5};
		int[] vett3;
		for (int i = 0; i< vett1.length; i++) {
			 if(vett[i]==vett1[i]) {
				 System.out.println("la dimensione è uguale ");
			 }
			 vett3[i]  += vett[i];
			 vett3 [i] += vett1[i];
			 i++;
		}
		
	}

}
