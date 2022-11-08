
package lezione8Adecco2Set;

import java.util.Scanner;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key=new Scanner(System.in);
		
		PersonaClasse persona1=new PersonaClasse();
		
		System.out.println("inserisci il nome");
		persona1.nome=key.next();
		
		System.out.println("iniserisci età");
		persona1.eta=key.nextInt()	;
		
		
		System.out.println(persona1.nome);
		System.out.println(persona1.eta);
		
		
		key.close();
	}

}
