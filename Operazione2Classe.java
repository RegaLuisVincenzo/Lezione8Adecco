package lezione8Adecco2Set;

/**
 * 
 * 1-Funzione Creare una funzione che prenda in input un numero e resituisca
 * true o false se il numero e' pari restituisce true altrimenti false.
 */
public class Operazione2Classe {

	public boolean number(int number) {
		/*
		 * if(number % 2 ==0) { return true; } return false;
		 */
		return number % 2 == 0;
	}

	/**
	 * 2-Funzione. Creare una funzione che prenda in input una Stringa e ritorna
	 * true se la stringa inizia con una vocale altrimenti false.
	 */

	public boolean isWordStarWithVowel(String parola) {

//		char firstCharacter = parola.charAt(0);

		if (parola.charAt(0) == 'a' || parola.charAt(0) == 'e' || parola.charAt(0) == 'i' || parola.charAt(0) == 'o'
				|| parola.charAt(0) == 'u')
			return true;

		return false;
	}
}
