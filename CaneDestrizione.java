package lezione8Adecco2Set;

import java.util.Scanner;

public class CaneDestrizione {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key=new Scanner(System.in);
		Cane cane1=new Cane();
		
		System.out.println("INSERISCI NOME---> ");
		cane1.nome=key.next();
		
		System.out.print("INSERISCI ETA---> ");
		cane1.eta=key.nextInt();
		
		System.out.println("Quante volte abaia il cane ");
		//cane1.dark();//questo permette di baiare il cane
		
		//oppure per falo ripetere 10 volte 
		
		int i=0;
		
		while(i<10) {
			cane1.dark();
			i++;
		}
		key.close();
		

	}

}
