package cours.p8exceptions;

public class Exception2 {

	public static void main(String[] args) {
		int i = 0;
		int j = 1;
		
		// on peut attraper les exceptions pour afficher un message par exemple
		try {
			int k = j / i; // division par zéro
			
			// on ne passera jamais ici
			System.out.println(k);
		} catch(ArithmeticException e) {
			System.err.println("Erreur de division par zéro");
		}

	}

}
