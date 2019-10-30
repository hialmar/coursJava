package cours.p3structurescontrole;

public class P3StructuresControle {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		boolean unBooleen = false;

		// instruction conditionnelle
		if (a == b) {
			System.out.println("Ils sont égaux");
		}

		// instruction conditionnelle avec choix par défaut
		if (a == b) {
			System.out.println("Ils sont égaux");
		} else {
			System.out.println("Ils sont inégaux");
		}
		
		// autre exemple
		if ((a > b) && (a > c)) {
			System.out.println("a est le plus grand des trois.");
		} else {
			System.out.println("a n'est pas le plus grand des trois.");
		}
		
		// même exemple avec un booléen
		unBooleen = (a > b) && (a > c);
		if (unBooleen) {
			System.out.println("a est le plus grand des trois.");
		} else {
			System.out.println("a n'est pas le plus grand des trois.");
		}

		// instruction conditionnelle avec plusieurs choix et choix par défaut
		if (a < b) {
			System.out.println("a est plus petit que b");
		} else if (a == b) {
			System.out.println("Ils sont égaux");
		} else {
			System.out.println("a est plus grand que b");
		}

		// instruction conditionnelle sur une variable (switch)
		switch (a) {
		case 0:
			System.out.println("a vaut 0");
			break;
		case 1:
			System.out.println("a vaut 1");
			break;
		default:
			System.out.println("a ne vaut ni 0 ni 1");
			break;
		}
		
		// répétitions (boucles)
		// tant que
		a = 0;
		while(a < 10) {
			System.out.println("1 - a vaut "+a);
			a++;
		}
		
		// pour
		for(a = 0; a < 10; a++) {
			System.out.println("2 - a vaut "+a);
		}
		
		// faire tant que
		a = 0;
		do {
			System.out.println("3 - a vaut "+a);
			a++;
		} while(a<10);

	}

}
