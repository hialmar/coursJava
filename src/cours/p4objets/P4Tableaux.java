package cours.p4objets;

public class P4Tableaux {

	public static void main(String[] args) {
		// tableaux
		// attention il faut créer les "cases" du tableau en utilisant l'opérateur new
		int [] tabEntiers = new int[3];
		// les tableaux fonctionnent un peu comme des objets et ont un attribut length
		// qui stocke la taille du tableau
		// pour les parcourir on commence à 0
		// voilà une boucle pour remplir le tableau
		for(int i=0; i<tabEntiers.length; i++) {
			// on affecte un entier à la i-ème case du tableau
			tabEntiers[i] = i;
		}
		
		// tableau d'objets
		// ici on ne crèe que les cases du tableau
		// il faudra ensuite créer les objets
		String [] tabChaines = new String[3];
		for(int i=0; i<tabChaines.length; i++) {
			// on crèe un objet et on range sa référence dans la case du tableau
			tabChaines[i] = new String("chaine "+i);
		}
		
		// Affichons le tableau
		for(int i=0; i<tabChaines.length; i++) {
			System.out.println(tabChaines[i]);
		}
		
		// on peut aussi écrire
		// la variable chaine prendra successivement la valeur de chaque chaine du tableau
		// on appelle parfois cette boudle un for each
		for(String chaine : tabChaines) {
			System.out.println(chaine);
		}
		// ça marche aussi pour les tableaux d'entiers.
		for(int i : tabEntiers) {
			System.out.println(i);
		}
		
	}

}
