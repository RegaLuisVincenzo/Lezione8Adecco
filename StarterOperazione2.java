package lezione8Adecco2Set;

import java.util.Scanner;

public class StarterOperazione2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		Operazione2Classe op2 = new Operazione2Classe();

		boolean loo0n = true;
		do {
			System.out.println("INSERISCI NUMERO ");
			String parola = key.nextLine();

			if (op2.isWordStarWithVowel(parola))
				System.out.println("n.pari");
			else {
				System.out.println("n.dispari");

			}
		} while (loo0n);

		key.close();
	}

}
