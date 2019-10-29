package cours.p8exceptions;

public class Exception1 {

	public static void main(String[] args) {
		int i = 0;
		int j = 1;
		
		int k = j / i; // division par zéro
		
		// on ne passera jamais ici
		System.out.println(k);

	}

}
